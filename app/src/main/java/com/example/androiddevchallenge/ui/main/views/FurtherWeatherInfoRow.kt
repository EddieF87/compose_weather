/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.main.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import kotlin.math.roundToInt

@Composable
fun FurtherWeatherInfoRow(
    rain: Double,
    snow: Double,
    chanceOfPrecipitation: String,
    wind_speed: Double,
    wind_deg: Double,
    humidity: Double,
    uvi: Double
) = Row(
    horizontalArrangement = Arrangement.Start,
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier.fillMaxWidth()
) {
    rain.takeIf { it > 0.0 }?.let {
        PrecipitationColumn(
            stringResource(R.string.rain),
            rain,
            chanceOfPrecipitation
        )
        Spacer(Modifier.width(16.dp))
    }
    snow.takeIf { it > 0.0 }?.let {
        PrecipitationColumn(
            stringResource(R.string.snow),
            snow,
            chanceOfPrecipitation
        )
        Spacer(Modifier.width(16.dp))
    }
    WindDisplay(speed = wind_speed, degrees = wind_deg, isMetric = true)
    Spacer(Modifier.width(16.dp))
    HumidityAndUVColumn(humidity, uvi)
}

@Composable
fun HumidityAndUVColumn(humidity: Double, uvi: Double) = Column {
    Text("Humidity: $humidity%")
    Text("UV: $uvi")
}

@Composable
fun WindDisplay(speed: Double, degrees: Double, isMetric: Boolean) {
    val windDirection = degrees.toFloat() + 90f
    Column {
        Row {
            Text("Wind", style = MaterialTheme.typography.h4)
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_forward_24),
                contentDescription = "Wind degrees: $degrees",
                modifier = Modifier.rotate(windDirection)
            )
        }
        val speedAmount = (if (isMetric) speed.toKilometersPerHour() else speed).roundToInt()
        val unitType = stringResource(if (isMetric) R.string.unit_kmh else R.string.unit_mph)
        Text("$speedAmount $unitType")
    }
}

fun Double.toKilometersPerHour() = this * 60 * 60 / 1000
