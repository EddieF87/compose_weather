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
package com.example.androiddevchallenge.ui.main

import android.content.Intent
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.provider.Settings
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.WeatherForecast
import com.example.androiddevchallenge.ui.main.views.CurrentForecastDisplay
import com.example.androiddevchallenge.ui.main.views.DailyForecastList
import com.example.androiddevchallenge.ui.main.views.ErrorDisplay
import com.example.androiddevchallenge.ui.main.views.HourlyForecastList
import com.example.androiddevchallenge.ui.main.views.Loader
import com.example.androiddevchallenge.ui.main.views.LocationHeader
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.util.DisplayUtils
import com.example.androiddevchallenge.util.GeocodeUtils
import com.example.androiddevchallenge.util.LocationService
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DisplayUtils.getScreenMetrics(this)
        setContent {
            MyTheme {
                MyApp()
            }
        }
        mainViewModel.getUserLocation()
    }

    @Composable
    fun MyApp() {
        Surface(color = MaterialTheme.colors.background) {
            val locationState: LocationService.LocationState? by mainViewModel.locationState.observeAsState()
            val weatherForecast: WeatherForecast? by mainViewModel.weather.observeAsState()
            weatherForecast?.let { forecast ->
                val address = GeocodeUtils.parseLocation(
                    Geocoder(LocalContext.current),
                    forecast.lat,
                    forecast.lon
                )
                MainWeatherDisplay(forecast, address)
            } ?: LocationStateDisplay(locationState)
        }
    }

    @Composable
    fun MainWeatherDisplay(weatherForecast: WeatherForecast, address: String) {
        with(weatherForecast) {
            LazyColumn {
                item {
                    LocationHeader(address)
                    current?.let {
                        ForecastHeader(stringResource(R.string.current_weather))
                        CurrentForecastDisplay(it)
                    }
                    daily?.let {
                        ForecastHeader(stringResource(R.string.daily_forecast))
                        DailyForecastList(it)
                    }
                    hourly?.let {
                        ForecastHeader(stringResource(R.string.hourly_forecast))
                        HourlyForecastList(it, hourlyGroupedByDate, hourlyGroupSizes)
                    }
                }
            }
        }
    }

    @Composable
    private fun ForecastHeader(text: String) {
        Text(text, style = MaterialTheme.typography.h3, modifier = Modifier.padding(start = 16.dp, top = 4.dp))
    }

    @Composable
    fun LocationStateDisplay(state: LocationService.LocationState?) {
        when (state) {
            LocationService.LocationState.Loading -> Loader(stringResource(R.string.loading_location))
            is LocationService.LocationState.LocationReturned -> {
                mainViewModel.fetchWeatherData(state.location)
                Loader(stringResource(R.string.loading_weather_data))
            }
            is LocationService.LocationState.PermissionsRequired -> {
                requestPermissions(state.permissions, state.code)
            }
            LocationService.LocationState.ErrorPermissionDenied -> ErrorDisplay(
                title = stringResource(R.string.error_location_permission_denied),
                description = stringResource(R.string.location_disclaimer),
                resolveErrorText = stringResource(R.string.resolve_allow_location),
                onResolveError = mainViewModel::getUserLocation,
                onUseDummyData = { mainViewModel.fetchWeatherData(Location("")) }
            )
            LocationService.LocationState.ErrorProviderNotEnabled -> ErrorDisplay(
                title = stringResource(R.string.error_location_not_turned_on),
                description = stringResource(R.string.location_disclaimer),
                resolveErrorText = stringResource(R.string.resolve_turn_on_location),
                onResolveError = ::goToLocationSettings,
                onUseDummyData = { mainViewModel.fetchWeatherData(Location("")) }
            )
            LocationService.LocationState.ErrorLocationNotFound -> ErrorDisplay(
                title = stringResource(R.string.error_location_not_found),
                description = stringResource(R.string.location_being_requested),
                resolveErrorText = "",
                onResolveError = { },
                onUseDummyData = { mainViewModel.fetchWeatherData(Location("")) }
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            LocationService.LOCATION_PERMISSION_REQUEST_CODE -> {
                if (grantResults.getOrNull(0) == PackageManager.PERMISSION_GRANTED) {
                    mainViewModel.getUserLocation()
                } else {
                    mainViewModel.onLocationPermissionDenied()
                }
            }
        }
    }

    private fun goToLocationSettings() {
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            mainViewModel.getUserLocation()
        }.launch(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS))
    }

    @Preview("Light Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun LightPreview() = MyTheme { MyApp() }

    @Preview("Dark Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun DarkPreview() = MyTheme(darkTheme = true) { MyApp() }
}
