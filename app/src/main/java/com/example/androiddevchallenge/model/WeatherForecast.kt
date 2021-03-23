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
package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.util.WeatherDateUtils
import com.google.gson.annotations.SerializedName

data class WeatherForecast(
    val lat: Double,
    val lon: Double,
    val timezone: String,
    val timezone_offset: Double,
    val current: Current?,
    val daily: List<Daily>?,
    val hourly: List<Hourly>?
) {
    inner class Current(
        val dt: Long,
        val sunrise: Long,
        val sunset: Long,
        val temp: Double,
        val weather: List<Weather>,
        val humidity: Double,
        val wind_speed: Double,
        val wind_deg: Double,
        val pop: Double,
        val rain: Rain?,
        val snow: Snow?,
        val uvi: Double
    ) {
        val date get() = WeatherDateUtils.convertUnixToDate(dt)
        val time get() = WeatherDateUtils.convertUnixToTime(dt)
        val sunriseTime get() = WeatherDateUtils.convertUnixToTime(sunrise)
        val sunsetTime get() = WeatherDateUtils.convertUnixToTime(sunset)
        val chanceOfPrecipitation get() = pop.toChanceOfPrecipitation()
    }

    inner class Daily(
        val dt: Long,
        val sunrise: Long,
        val sunset: Long,
        val temp: Temperature,
        val weather: List<Weather>,
        val humidity: Double,
        val wind_speed: Double,
        val wind_deg: Double,
        val pop: Double,
        val rain: Double,
        val snow: Double,
        val uvi: Double
    ) {
        val date get() = WeatherDateUtils.convertUnixToDate(dt)
        val time get() = WeatherDateUtils.convertUnixToTime(dt)
        val sunriseTime get() = WeatherDateUtils.convertUnixToTime(sunrise)
        val sunsetTime get() = WeatherDateUtils.convertUnixToTime(sunset)
        val chanceOfPrecipitation get() = pop.toChanceOfPrecipitation()

        inner class Temperature(
            val min: Double,
            val max: Double,
            val morn: Double,
            val day: Double,
            val eve: Double,
            val night: Double
        )
    }

    inner class Hourly(
        val dt: Long,
        val temp: Double,
        val weather: List<Weather>,
        val humidity: Double,
        val wind_speed: Double,
        val wind_deg: Double,
        val pop: Double,
        val rain: Rain?,
        val snow: Snow?,
        val uvi: Double
    ) {
        val date get() = WeatherDateUtils.convertUnixToDate(dt)
        val time get() = WeatherDateUtils.convertUnixToTime(dt)
        val chanceOfPrecipitation get() = pop.toChanceOfPrecipitation()
    }

    inner class Weather(
        val id: Double,
        val main: String,
        val description: String,
        val icon: String
    ) {
        var sameIconAsPrevious = false
        val iconUrl get() = if (icon.isNotEmpty()) "https://openweathermap.org/img/wn/$icon@2x.png" else ""
    }

    interface Precipitation {
        val hour: Double
    }

    data class Rain(
        @SerializedName("1h")
        override val hour: Double
    ) : Precipitation

    data class Snow(
        @SerializedName("1h")
        override val hour: Double
    ) : Precipitation

    val hourlyGroupedByDate: Map<String, List<Hourly>>
        get() = hourly?.groupBy { it.date } ?: emptyMap()
    val hourlyGroupSizes: List<Int> get() = hourlyGroupedByDate.map { it.value.size }
}

private fun Double.toChanceOfPrecipitation() = "${(this * 100).toInt()}%"
