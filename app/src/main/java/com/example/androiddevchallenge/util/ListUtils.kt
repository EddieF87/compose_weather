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

object ListUtils {

    fun getForecastIndex(indexWithHeaders: Int, itemOffset: Int, groupedSizes: List<Int>): Int {
        var indexWithoutHeaders = indexWithHeaders - 1
        var totalGroupSize = 0
        groupedSizes.forEach { groupSize ->
            totalGroupSize += groupSize + 1
            if (indexWithHeaders >= totalGroupSize) {
                indexWithoutHeaders--
            } else {
                if (itemOffset > 240) indexWithoutHeaders++
                return indexWithoutHeaders
            }
        }
        if (itemOffset > 240) indexWithoutHeaders++
        return indexWithoutHeaders
    }
}
