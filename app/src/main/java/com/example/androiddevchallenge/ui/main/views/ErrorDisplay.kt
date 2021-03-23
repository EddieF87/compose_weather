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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Composable
internal fun ErrorDisplay(
    title: String,
    description: String = "",
    resolveErrorText: String,
    onResolveError: () -> Unit,
    onUseDummyData: () -> Unit
) {
    Column(verticalArrangement = Arrangement.Center) {
        Text(title, style = MaterialTheme.typography.h2)
        Spacer(modifier = Modifier.height(16.dp))
        if (description.isNotEmpty()) {
            Text(description, style = MaterialTheme.typography.subtitle2)
            Spacer(modifier = Modifier.height(16.dp))
        }
        if (resolveErrorText.isNotEmpty()) {
            Button(onClick = onResolveError) {
                Text(resolveErrorText, style = MaterialTheme.typography.button)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onUseDummyData) {
            Text(stringResource(R.string.use_fake_data), style = MaterialTheme.typography.button)
        }
    }
}
