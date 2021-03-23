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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.WeatherForecast
import com.example.androiddevchallenge.util.DisplayUtils
import com.example.androiddevchallenge.util.toDegrees

@Composable
internal fun DailyForecastList(dailyForecasts: List<WeatherForecast.Daily>) = LazyRow(
    modifier = Modifier.fillMaxWidth()
) { items(dailyForecasts) { dailyForecast -> DailyForecastItem(dailyForecast) } }

@Composable
private fun DailyForecastItem(dailyForecast: WeatherForecast.Daily) = Card(
    shape = MaterialTheme.shapes.small,
    elevation = 4.dp,
    border = BorderStroke(4.dp, Color.White),
    modifier = Modifier
        .width(DisplayUtils.screenWidthDp)
        .fillMaxHeight()
        .padding(horizontal = 16.dp)
) {
    with(dailyForecast) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 24.dp)
            ) {
                Column {
                    Text(text = date, style = MaterialTheme.typography.h2)
                    Text(
                        text = "${temp.min.toDegrees()} / ${temp.max.toDegrees()}",
                        style = MaterialTheme.typography.h2
                    )
                }
                weather.firstOrNull()?.let { WeatherIconAndDescription(it, 72, false) }
            }
            Column(Modifier.padding(16.dp)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    SunriseSunsetColumn(sunriseTime, sunsetTime)
                    Spacer(Modifier.width(48.dp))
                    DailyTempBreakdown(temp)
                }
                FurtherWeatherInfoRow(
                    rain,
                    snow,
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

@Composable
private fun DailyTempBreakdown(temp: WeatherForecast.Daily.Temperature) = Row {
    TempColumn(stringResource(R.string.morn), temp.morn)
    Spacer(Modifier.width(6.dp))
    TempColumn(stringResource(R.string.day), temp.day)
    Spacer(Modifier.width(6.dp))
    TempColumn(stringResource(R.string.eve), temp.eve)
    Spacer(Modifier.width(6.dp))
    TempColumn(stringResource(R.string.night), temp.night)
}

@Composable
private fun TempColumn(label: String, temp: Double) =
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(label)
        Text(temp.toDegrees())
    }
