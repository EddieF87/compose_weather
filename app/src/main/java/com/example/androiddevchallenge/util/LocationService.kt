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

import android.Manifest
import android.app.Application
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LocationService(private val app: Application) : LocationListener {

    sealed class LocationState {
        data class LocationReturned(val location: Location) : LocationState()
        data class PermissionsRequired(val permissions: Array<String>, val code: Int) :
            LocationState()

        object Loading : LocationState()
        object ErrorLocationNotFound : LocationState()
        object ErrorProviderNotEnabled : LocationState()
        object ErrorPermissionDenied : LocationState()
    }

    private val _locationState = MutableLiveData<LocationState>(LocationState.Loading)
    val locationState: LiveData<LocationState>
        get() = _locationState

    fun getUserLocation() {
        _locationState.value = LocationState.Loading
        _locationState.value = if (ActivityCompat.checkSelfPermission(
                app, Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(
                    app, Manifest.permission.ACCESS_COARSE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED
        ) {
            val lm = app.getSystemService(AppCompatActivity.LOCATION_SERVICE) as LocationManager
            if (isLocationProviderEnabled(lm)) {
                lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)?.let {
                    LocationState.LocationReturned(it)
                } ?: lm.getLastKnownLocation(LocationManager.GPS_PROVIDER)?.let {
                    LocationState.LocationReturned(it)
                } ?: LocationState.ErrorLocationNotFound.also {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                        lm.getCurrentLocation(
                            LocationManager.NETWORK_PROVIDER,
                            null,
                            app.mainExecutor
                        ) {
                            onLocationChanged(it)
                        }
                    } else {
                        lm.requestLocationUpdates(
                            LocationManager.NETWORK_PROVIDER,
                            60_000L,
                            10_000F,
                            this
                        )
                    }
                }
            } else {
                LocationState.ErrorProviderNotEnabled
            }
        } else {
            LocationState.PermissionsRequired(
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                LOCATION_PERMISSION_REQUEST_CODE
            )
        }
    }

    fun onLocationPermissionDenied() {
        _locationState.value = LocationState.ErrorPermissionDenied
    }

    private fun isLocationProviderEnabled(lm: LocationManager): Boolean =
        lm.isEnabled(LocationManager.GPS_PROVIDER) ||
            lm.isEnabled(LocationManager.NETWORK_PROVIDER) ||
            lm.isEnabled(LocationManager.PASSIVE_PROVIDER)

    private fun LocationManager.isEnabled(provider: String) = try {
        isProviderEnabled(provider)
    } catch (ex: Exception) {
        false
    }

    companion object {
        const val LOCATION_PERMISSION_REQUEST_CODE = 429
    }

    override fun onLocationChanged(location: Location) {
        _locationState.value = LocationState.LocationReturned(location)
    }
}
