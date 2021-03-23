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

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.WeatherForecast
import com.example.androiddevchallenge.util.DisplayUtils
import com.example.androiddevchallenge.util.toDegrees

@Composable
internal fun CurrentForecastDisplay(currentForecast: WeatherForecast.Current) {
    Card(
        shape = MaterialTheme.shapes.small,
        elevation = 6.dp,
        border = BorderStroke(4.dp, Color.White),
        modifier = Modifier
            .width(DisplayUtils.screenWidthDp)
            .fillMaxHeight()
            .padding(horizontal = 16.dp)
    ) {
        with(currentForecast) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(12.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(temp.toDegrees(), style = MaterialTheme.typography.h1)
                    Spacer(Modifier.width(4.dp))
                    weather.firstOrNull()?.let { WeatherIconAndDescription(it, 96, true) }
                }
                Column {
                    SunriseSunsetColumn(sunriseTime, sunsetTime)
                    FurtherWeatherInfoRow(
                        rain?.hour ?: 0.0,
                        snow?.hour ?: 0.0,
                        chanceOfPrecipitation,
                        wind_speed,
                        wind_deg,
                        humidity,
                        uvi
                    )
                }
            }
        }
    }
}
