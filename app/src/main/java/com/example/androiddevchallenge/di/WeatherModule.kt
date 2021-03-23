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
package com.example.androiddevchallenge.di

import android.util.Log
import com.example.androiddevchallenge.service.WeatherService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class WeatherModule {

    private val WEATHER_URL = "https://api.openweathermap.org/data/2.5/"

    @Singleton
    @Provides
    fun provideWeatherService(): WeatherService {
        val builder: OkHttpClient.Builder = OkHttpClient().newBuilder().also {
            it.readTimeout(10, TimeUnit.SECONDS)
            it.connectTimeout(5, TimeUnit.SECONDS)
//            it.addInterceptor(Interceptor { chain: Interceptor.Chain ->
//                val request =  chain.request().newBuilder().build()
//                val response = chain.proceed(request)
//                response.peekBody(99999).string().bigLog()
//                response
//            })
        }
        val client = builder.build()
        val retrofit = Retrofit.Builder()
            .baseUrl(WEATHER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

        return retrofit.create(WeatherService::class.java)
    }
}

fun String.bigLog() {
    val maxLogSize = 1000
    val stringLength = this.length
    for (i in 0..stringLength / maxLogSize) {
        val start = i * maxLogSize
        var end = (i + 1) * maxLogSize
        end = if (end > this.length) this.length else end
        Log.d("YOURTAG", this.substring(start, end))
    }
}
