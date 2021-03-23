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

import android.app.Activity
import android.os.Build
import android.util.DisplayMetrics
import androidx.compose.ui.unit.dp

object DisplayUtils {

    private val displayMetrics = DisplayMetrics()
    var screenHeightDp = 0.0.dp
    var screenWidthDp = 0.0.dp

    fun getScreenMetrics(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            activity.display?.getRealMetrics(displayMetrics)
        } else {
            @Suppress("DEPRECATION")
            activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
        }
        screenHeightDp = activity.pxToDp(displayMetrics.heightPixels).dp
        screenWidthDp = activity.pxToDp(displayMetrics.widthPixels).dp
    }
}
