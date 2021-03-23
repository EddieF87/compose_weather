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

import android.location.Location
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.model.WeatherForecast
import com.example.androiddevchallenge.model.fakeWeatherForecast
import com.example.androiddevchallenge.service.WeatherService
import com.example.androiddevchallenge.util.LocationService
import com.example.androiddevchallenge.util.WeatherDateUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val weatherService: WeatherService,
    private val locationService: LocationService,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    val locationState: LiveData<LocationService.LocationState> = locationService.locationState

    private val _weather = MutableLiveData<WeatherForecast>()
    val weather: LiveData<WeatherForecast>
        get() = _weather

    fun fetchWeatherData(location: Location) {
        GlobalScope.launch(Dispatchers.Main) {
            val weatherForecast: WeatherForecast = withContext(Dispatchers.IO) {
                useMockData()
//                useRealData(location)
            }
            _weather.value = weatherForecast.apply {
                WeatherDateUtils.timeZone = timezone
                var previousIcon = ""
                hourly?.forEach { hourly ->
                    hourly.weather.firstOrNull()?.let {
                        it.sameIconAsPrevious = if (it.icon == previousIcon) {
                            true
                        } else {
                            previousIcon = it.icon
                            false
                        }
                    }
                }
            }
        }
    }

    fun onLocationPermissionDenied() = locationService.onLocationPermissionDenied()

    fun getUserLocation() = locationService.getUserLocation()

    fun useMockData() = fakeWeatherForecast

    private suspend fun useRealData(location: Location) = weatherService.getDailyForecast(
        lat = location.latitude.toString(),
        lon = location.longitude.toString(),
        exclude = "minutely"
    ).body()!!
}
