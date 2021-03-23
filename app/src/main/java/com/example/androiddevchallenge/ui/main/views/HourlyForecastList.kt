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
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.WeatherForecast
import com.example.androiddevchallenge.model.fakeWeatherForecast
import com.example.androiddevchallenge.ui.theme.blue
import com.example.androiddevchallenge.util.ListUtils
import com.example.androiddevchallenge.util.toDegrees
import com.google.accompanist.coil.CoilImage

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HourlyForecastList(
    hourlyForecasts: List<WeatherForecast.Hourly>,
    groupedForecasts: Map<String, List<WeatherForecast.Hourly>>,
    groupedSizes: List<Int>
) {
    val listState = rememberLazyListState()
    Card(
        shape = MaterialTheme.shapes.small,
        elevation = 4.dp,
        border = BorderStroke(4.dp, Color.White),
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        LazyRow(
            state = listState,
//            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 0.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
        ) {
            groupedForecasts.forEach { (date, forecasts) ->
                stickyHeader { DateHeader(date) }
                items(forecasts) { hourlyForecast -> HourlyForecastItem(hourlyForecast) }
            }
        }
        val forecastIndex = ListUtils.getForecastIndex(
            listState.firstVisibleItemIndex,
            listState.firstVisibleItemScrollOffset,
            groupedSizes
        )
        hourlyForecasts.getOrNull(forecastIndex)?.weather?.firstOrNull()?.iconUrl?.let {
            HourlyWeatherIconHeader(it)
        }
    }
}

@Preview("HourlyWeatherHeaderIcon")
@Composable
private fun HourlyWeatherIconHeader(iconUrl: String = "") {
    Card(
        backgroundColor = blue,
        modifier = Modifier
            .size(80.dp)
            .padding(4.dp)
    ) {
        CoilImage(
            data = iconUrl,
            contentDescription = "My content description",
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview("HourlyForecastItem")
@Composable
private fun HourlyForecastItem(@PreviewParameter(HourlyForecastProvider::class) hourlyForecast: WeatherForecast.Hourly) {
    with(hourlyForecast) {
        Column {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp)
            ) {
                weather.firstOrNull()?.let {
                    CoilImage(
                        data = it.iconUrl,
                        contentDescription = "My content description",
                        modifier = Modifier
                            .fillMaxSize()
                            .alpha(if (it.sameIconAsPrevious) .16f else .75f)
                    )
                }
            }
            Column(modifier = Modifier.padding(16.dp)) {
                Text(time, style = MaterialTheme.typography.h5)
                Text(temp.toDegrees(), style = MaterialTheme.typography.h5)
                rain?.let {
                    PrecipitationColumn(
                        stringResource(R.string.rain), it.hour, chanceOfPrecipitation
                    )
                }
                snow?.let {
                    PrecipitationColumn(
                        stringResource(R.string.snow), it.hour, chanceOfPrecipitation
                    )
                }
            }
        }
    }
}

class HourlyForecastProvider(
    override val values: Sequence<WeatherForecast.Hourly> = sequenceOf(fakeWeatherForecast.hourly!!.first())
) : PreviewParameterProvider<WeatherForecast.Hourly>
