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
package com.example.androiddevchallenge.util

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

object WeatherDateUtils {

    var timeZone = ""

    fun convertUnixToDate(unixTime: Long): String =
        formatDate(unixTime, SimpleDateFormat.getDateInstance())

    fun convertUnixToDateShort(unixTime: Long): String =
        formatDate(unixTime, SimpleDateFormat.getDateInstance(DateFormat.SHORT))

    fun convertUnixToTime(unixTime: Long): String =
        formatDate(unixTime, SimpleDateFormat.getTimeInstance(DateFormat.SHORT))

    private fun formatDate(unixTime: Long, dateFormat: DateFormat): String = try {
        dateFormat.timeZone = TimeZone.getTimeZone(timeZone)
        val netDate = Date(unixTime.times(1000))
        dateFormat.format(netDate) ?: ""
    } catch (e: Exception) {
        e.toString()
        ""
    }
}
