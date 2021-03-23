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

import android.graphics.Paint
import android.graphics.Typeface
import android.text.TextPaint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.util.dpToPx

@Composable
fun DateHeader(headerText: String) {
    val context = LocalContext.current
    val textColor = MaterialTheme.colors.onPrimary

    Canvas(
        modifier = Modifier
            .width(24.dp)
            .fillMaxHeight()
            .background(color = MaterialTheme.colors.primaryVariant)
    ) {
        val paint = TextPaint().apply {
            isAntiAlias = true
            textSize = context.dpToPx(18).toFloat()
            color = textColor.toArgb()
            typeface = Typeface.DEFAULT_BOLD
            textAlign = Paint.Align.CENTER
        }

        drawIntoCanvas {
            it.nativeCanvas.apply {
                rotate(-90F)
                drawText(
                    headerText,
                    -height + paint.measureText(headerText),
                    width.toFloat() - context.dpToPx(4).toFloat(),
                    paint
                )
                restore()
                save()
            }
        }
    }
}
