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

import com.google.gson.Gson

val fakeWeatherForecast: WeatherForecast
    get() = Gson().fromJson(
        fakeWeatherCurrentDailyHourlyJson,
        WeatherForecast::class.java
    )

val fakeWeatherCurrentDailyHourlyJson = """
    {
      "lat": 37.422,
      "lon": -122.084,
      "timezone": "America/Los_Angeles",
      "timezone_offset": -25200,
      "current": {
        "dt": 1616490094,
        "sunrise": 1616508405,
        "sunset": 1616552562,
        "temp": 8.71,
        "feels_like": 5.01,
        "pressure": 1019,
        "humidity": 76,
        "dew_point": 4.72,
        "uvi": 0,
        "clouds": 1,
        "visibility": 10000,
        "wind_speed": 3.6,
        "wind_deg": 290,
        "wind_gust": 9.26,
        "weather": [
          {
            "id": 800,
            "main": "Clear",
            "description": "clear sky",
            "icon": "01n"
          }
        ]
      },
      "hourly": [
        {
          "dt": 1616490000,
          "temp": 8.71,
          "feels_like": 4.53,
          "pressure": 1019,
          "humidity": 76,
          "dew_point": 4.72,
          "uvi": 0,
          "clouds": 1,
          "visibility": 10000,
          "wind_speed": 4.28,
          "wind_deg": 299,
          "wind_gust": 8.39,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616493600,
          "temp": 8.8,
          "feels_like": 5.69,
          "pressure": 1019,
          "humidity": 82,
          "dew_point": 5.9,
          "uvi": 0,
          "clouds": 24,
          "visibility": 10000,
          "wind_speed": 3.1,
          "wind_deg": 309,
          "wind_gust": 6.14,
          "weather": [
            {
              "id": 801,
              "main": "Clouds",
              "description": "few clouds",
              "icon": "02n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616497200,
          "temp": 8.38,
          "feels_like": 5.86,
          "pressure": 1018,
          "humidity": 88,
          "dew_point": 6.51,
          "uvi": 0,
          "clouds": 34,
          "visibility": 10000,
          "wind_speed": 2.45,
          "wind_deg": 321,
          "wind_gust": 5.23,
          "weather": [
            {
              "id": 802,
              "main": "Clouds",
              "description": "scattered clouds",
              "icon": "03n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616500800,
          "temp": 7.83,
          "feels_like": 5.57,
          "pressure": 1018,
          "humidity": 91,
          "dew_point": 6.45,
          "uvi": 0,
          "clouds": 36,
          "visibility": 10000,
          "wind_speed": 2.05,
          "wind_deg": 327,
          "wind_gust": 4.08,
          "weather": [
            {
              "id": 802,
              "main": "Clouds",
              "description": "scattered clouds",
              "icon": "03n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616504400,
          "temp": 7.41,
          "feels_like": 5.04,
          "pressure": 1018,
          "humidity": 92,
          "dew_point": 6.2,
          "uvi": 0,
          "clouds": 7,
          "visibility": 10000,
          "wind_speed": 2.14,
          "wind_deg": 332,
          "wind_gust": 4.27,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616508000,
          "temp": 7.12,
          "feels_like": 4.41,
          "pressure": 1018,
          "humidity": 92,
          "dew_point": 5.31,
          "uvi": 0,
          "clouds": 7,
          "visibility": 10000,
          "wind_speed": 2.53,
          "wind_deg": 325,
          "wind_gust": 5.6,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616511600,
          "temp": 8.08,
          "feels_like": 5.09,
          "pressure": 1018,
          "humidity": 86,
          "dew_point": 5.17,
          "uvi": 0.24,
          "clouds": 6,
          "visibility": 10000,
          "wind_speed": 2.92,
          "wind_deg": 334,
          "wind_gust": 9.08,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616515200,
          "temp": 10.37,
          "feels_like": 6.35,
          "pressure": 1018,
          "humidity": 63,
          "dew_point": 2.96,
          "uvi": 0.98,
          "clouds": 5,
          "visibility": 10000,
          "wind_speed": 3.76,
          "wind_deg": 345,
          "wind_gust": 8.57,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616518800,
          "temp": 12.48,
          "feels_like": 7.34,
          "pressure": 1019,
          "humidity": 43,
          "dew_point": -0.04,
          "uvi": 2.27,
          "clouds": 4,
          "visibility": 10000,
          "wind_speed": 4.56,
          "wind_deg": 347,
          "wind_gust": 8.89,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616522400,
          "temp": 14.36,
          "feels_like": 8.1,
          "pressure": 1018,
          "humidity": 34,
          "dew_point": -1.75,
          "uvi": 3.83,
          "clouds": 3,
          "visibility": 10000,
          "wind_speed": 5.85,
          "wind_deg": 351,
          "wind_gust": 10.47,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616526000,
          "temp": 15.98,
          "feels_like": 8.67,
          "pressure": 1018,
          "humidity": 28,
          "dew_point": -2.87,
          "uvi": 5.2,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 7.12,
          "wind_deg": 354,
          "wind_gust": 11.52,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616529600,
          "temp": 16.97,
          "feels_like": 9.31,
          "pressure": 1017,
          "humidity": 26,
          "dew_point": -3.23,
          "uvi": 5.84,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 7.6,
          "wind_deg": 356,
          "wind_gust": 11.73,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616533200,
          "temp": 17.67,
          "feels_like": 9.99,
          "pressure": 1017,
          "humidity": 25,
          "dew_point": -3.19,
          "uvi": 5.51,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 7.63,
          "wind_deg": 1,
          "wind_gust": 11.46,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616536800,
          "temp": 17.86,
          "feels_like": 10.12,
          "pressure": 1016,
          "humidity": 26,
          "dew_point": -2.46,
          "uvi": 4.35,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 7.85,
          "wind_deg": 6,
          "wind_gust": 11.53,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616540400,
          "temp": 17.9,
          "feels_like": 10.16,
          "pressure": 1016,
          "humidity": 28,
          "dew_point": -1.17,
          "uvi": 2.78,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 8.05,
          "wind_deg": 5,
          "wind_gust": 12.07,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616544000,
          "temp": 17.77,
          "feels_like": 10.63,
          "pressure": 1016,
          "humidity": 31,
          "dew_point": 0.15,
          "uvi": 1.38,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 7.45,
          "wind_deg": 357,
          "wind_gust": 12.71,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616547600,
          "temp": 16.98,
          "feels_like": 10,
          "pressure": 1016,
          "humidity": 33,
          "dew_point": 0.11,
          "uvi": 0.43,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 7.26,
          "wind_deg": 353,
          "wind_gust": 13.18,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616551200,
          "temp": 15.57,
          "feels_like": 9.09,
          "pressure": 1016,
          "humidity": 35,
          "dew_point": -0.28,
          "uvi": 0,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 6.45,
          "wind_deg": 350,
          "wind_gust": 13.05,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616554800,
          "temp": 14.58,
          "feels_like": 8.23,
          "pressure": 1017,
          "humidity": 36,
          "dew_point": -0.93,
          "uvi": 0,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 6.17,
          "wind_deg": 344,
          "wind_gust": 13.19,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616558400,
          "temp": 14.03,
          "feels_like": 7.84,
          "pressure": 1017,
          "humidity": 35,
          "dew_point": -1.69,
          "uvi": 0,
          "clouds": 1,
          "visibility": 10000,
          "wind_speed": 5.76,
          "wind_deg": 343,
          "wind_gust": 13.38,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616562000,
          "temp": 13.57,
          "feels_like": 7.91,
          "pressure": 1017,
          "humidity": 34,
          "dew_point": -2.6,
          "uvi": 0,
          "clouds": 1,
          "visibility": 10000,
          "wind_speed": 4.86,
          "wind_deg": 343,
          "wind_gust": 12.81,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616565600,
          "temp": 12.44,
          "feels_like": 7.29,
          "pressure": 1017,
          "humidity": 36,
          "dew_point": -2.66,
          "uvi": 0,
          "clouds": 1,
          "visibility": 10000,
          "wind_speed": 4.09,
          "wind_deg": 347,
          "wind_gust": 10.73,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616569200,
          "temp": 11.64,
          "feels_like": 6.86,
          "pressure": 1018,
          "humidity": 36,
          "dew_point": -3.22,
          "uvi": 0,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 3.44,
          "wind_deg": 354,
          "wind_gust": 8.33,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616572800,
          "temp": 10.72,
          "feels_like": 6.72,
          "pressure": 1018,
          "humidity": 40,
          "dew_point": -2.97,
          "uvi": 0,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 2.43,
          "wind_deg": 350,
          "wind_gust": 5.47,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616576400,
          "temp": 9.68,
          "feels_like": 6.22,
          "pressure": 1018,
          "humidity": 45,
          "dew_point": -2.44,
          "uvi": 0,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 1.77,
          "wind_deg": 349,
          "wind_gust": 3.05,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616580000,
          "temp": 9.08,
          "feels_like": 5.85,
          "pressure": 1018,
          "humidity": 47,
          "dew_point": -2.13,
          "uvi": 0,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 1.45,
          "wind_deg": 354,
          "wind_gust": 2.31,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616583600,
          "temp": 8.65,
          "feels_like": 5.63,
          "pressure": 1018,
          "humidity": 48,
          "dew_point": -2.14,
          "uvi": 0,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 1.13,
          "wind_deg": 9,
          "wind_gust": 1.74,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616587200,
          "temp": 8.31,
          "feels_like": 5.33,
          "pressure": 1018,
          "humidity": 48,
          "dew_point": -2.5,
          "uvi": 0,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 1.02,
          "wind_deg": 32,
          "wind_gust": 1.26,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616590800,
          "temp": 7.92,
          "feels_like": 5.07,
          "pressure": 1018,
          "humidity": 47,
          "dew_point": -3.1,
          "uvi": 0,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 0.72,
          "wind_deg": 42,
          "wind_gust": 1.12,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616594400,
          "temp": 7.67,
          "feels_like": 4.77,
          "pressure": 1018,
          "humidity": 46,
          "dew_point": -3.65,
          "uvi": 0,
          "clouds": 0,
          "visibility": 10000,
          "wind_speed": 0.7,
          "wind_deg": 50,
          "wind_gust": 1.16,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616598000,
          "temp": 8.91,
          "feels_like": 6.17,
          "pressure": 1018,
          "humidity": 45,
          "dew_point": -2.97,
          "uvi": 0.26,
          "clouds": 4,
          "visibility": 10000,
          "wind_speed": 0.62,
          "wind_deg": 60,
          "wind_gust": 0.87,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616601600,
          "temp": 11.59,
          "feels_like": 8.94,
          "pressure": 1018,
          "humidity": 37,
          "dew_point": -2.94,
          "uvi": 1.05,
          "clouds": 14,
          "visibility": 10000,
          "wind_speed": 0.45,
          "wind_deg": 66,
          "wind_gust": 0.96,
          "weather": [
            {
              "id": 801,
              "main": "Clouds",
              "description": "few clouds",
              "icon": "02d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616605200,
          "temp": 13.45,
          "feels_like": 10.56,
          "pressure": 1018,
          "humidity": 33,
          "dew_point": -3.06,
          "uvi": 2.43,
          "clouds": 31,
          "visibility": 10000,
          "wind_speed": 0.81,
          "wind_deg": 11,
          "wind_gust": 1.59,
          "weather": [
            {
              "id": 802,
              "main": "Clouds",
              "description": "scattered clouds",
              "icon": "03d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616608800,
          "temp": 15.1,
          "feels_like": 12.2,
          "pressure": 1017,
          "humidity": 29,
          "dew_point": -3.31,
          "uvi": 4.11,
          "clouds": 42,
          "visibility": 10000,
          "wind_speed": 0.77,
          "wind_deg": 341,
          "wind_gust": 1.34,
          "weather": [
            {
              "id": 802,
              "main": "Clouds",
              "description": "scattered clouds",
              "icon": "03d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616612400,
          "temp": 16.44,
          "feels_like": 12.65,
          "pressure": 1017,
          "humidity": 26,
          "dew_point": -3.48,
          "uvi": 5.07,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 1.99,
          "wind_deg": 336,
          "wind_gust": 2.65,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616616000,
          "temp": 17.76,
          "feels_like": 14.34,
          "pressure": 1016,
          "humidity": 24,
          "dew_point": -3.33,
          "uvi": 5.68,
          "clouds": 84,
          "visibility": 10000,
          "wind_speed": 1.47,
          "wind_deg": 326,
          "wind_gust": 2.38,
          "weather": [
            {
              "id": 803,
              "main": "Clouds",
              "description": "broken clouds",
              "icon": "04d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616619600,
          "temp": 18.64,
          "feels_like": 14.98,
          "pressure": 1015,
          "humidity": 23,
          "dew_point": -3.37,
          "uvi": 5.37,
          "clouds": 56,
          "visibility": 10000,
          "wind_speed": 1.84,
          "wind_deg": 316,
          "wind_gust": 2.75,
          "weather": [
            {
              "id": 803,
              "main": "Clouds",
              "description": "broken clouds",
              "icon": "04d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616623200,
          "temp": 18.94,
          "feels_like": 14.76,
          "pressure": 1014,
          "humidity": 24,
          "dew_point": -2.96,
          "uvi": 3.79,
          "clouds": 43,
          "visibility": 10000,
          "wind_speed": 2.73,
          "wind_deg": 307,
          "wind_gust": 3.56,
          "weather": [
            {
              "id": 802,
              "main": "Clouds",
              "description": "scattered clouds",
              "icon": "03d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616626800,
          "temp": 18.82,
          "feels_like": 14.48,
          "pressure": 1013,
          "humidity": 26,
          "dew_point": -2.01,
          "uvi": 2.45,
          "clouds": 37,
          "visibility": 10000,
          "wind_speed": 3.14,
          "wind_deg": 300,
          "wind_gust": 3.47,
          "weather": [
            {
              "id": 802,
              "main": "Clouds",
              "description": "scattered clouds",
              "icon": "03d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616630400,
          "temp": 17.62,
          "feels_like": 13.61,
          "pressure": 1012,
          "humidity": 31,
          "dew_point": -0.89,
          "uvi": 1.23,
          "clouds": 48,
          "visibility": 10000,
          "wind_speed": 2.95,
          "wind_deg": 291,
          "wind_gust": 3.41,
          "weather": [
            {
              "id": 802,
              "main": "Clouds",
              "description": "scattered clouds",
              "icon": "03d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616634000,
          "temp": 15.18,
          "feels_like": 11.42,
          "pressure": 1012,
          "humidity": 44,
          "dew_point": 1.95,
          "uvi": 0.4,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 3.23,
          "wind_deg": 289,
          "wind_gust": 4.47,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616637600,
          "temp": 12.71,
          "feels_like": 9.8,
          "pressure": 1012,
          "humidity": 60,
          "dew_point": 4.05,
          "uvi": 0,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 2.59,
          "wind_deg": 273,
          "wind_gust": 4.14,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04d"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616641200,
          "temp": 10.7,
          "feels_like": 8.15,
          "pressure": 1012,
          "humidity": 72,
          "dew_point": 4.97,
          "uvi": 0,
          "clouds": 84,
          "visibility": 10000,
          "wind_speed": 2.29,
          "wind_deg": 251,
          "wind_gust": 3.94,
          "weather": [
            {
              "id": 803,
              "main": "Clouds",
              "description": "broken clouds",
              "icon": "04n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616644800,
          "temp": 10.33,
          "feels_like": 8.16,
          "pressure": 1012,
          "humidity": 77,
          "dew_point": 5.8,
          "uvi": 0,
          "clouds": 85,
          "visibility": 10000,
          "wind_speed": 1.94,
          "wind_deg": 255,
          "wind_gust": 3.64,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616648400,
          "temp": 10.16,
          "feels_like": 8.56,
          "pressure": 1012,
          "humidity": 80,
          "dew_point": 6.34,
          "uvi": 0,
          "clouds": 87,
          "visibility": 10000,
          "wind_speed": 1.25,
          "wind_deg": 239,
          "wind_gust": 2.94,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616652000,
          "temp": 9.92,
          "feels_like": 8.5,
          "pressure": 1012,
          "humidity": 82,
          "dew_point": 6.48,
          "uvi": 0,
          "clouds": 89,
          "visibility": 10000,
          "wind_speed": 1.03,
          "wind_deg": 226,
          "wind_gust": 2.84,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616655600,
          "temp": 9.52,
          "feels_like": 7.91,
          "pressure": 1012,
          "humidity": 84,
          "dew_point": 6.39,
          "uvi": 0,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 1.29,
          "wind_deg": 217,
          "wind_gust": 3.47,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04n"
            }
          ],
          "pop": 0
        },
        {
          "dt": 1616659200,
          "temp": 9.4,
          "feels_like": 7.73,
          "pressure": 1012,
          "humidity": 84,
          "dew_point": 6.28,
          "uvi": 0,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 1.33,
          "wind_deg": 239,
          "wind_gust": 4.34,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04n"
            }
          ],
          "pop": 0
        }
      ],
      "daily": [
        {
          "dt": 1616529600,
          "sunrise": 1616508405,
          "sunset": 1616552562,
          "temp": {
            "day": 16.97,
            "min": 7.12,
            "max": 17.9,
            "night": 12.44,
            "eve": 15.57,
            "morn": 7.12
          },
          "feels_like": {
            "day": 9.31,
            "night": 7.29,
            "eve": 9.09,
            "morn": 4.41
          },
          "pressure": 1017,
          "humidity": 26,
          "dew_point": -3.23,
          "wind_speed": 7.6,
          "wind_deg": 356,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "clouds": 0,
          "pop": 0,
          "uvi": 5.84
        },
        {
          "dt": 1616616000,
          "sunrise": 1616594713,
          "sunset": 1616639015,
          "temp": {
            "day": 17.76,
            "min": 7.67,
            "max": 18.94,
            "night": 9.92,
            "eve": 12.71,
            "morn": 7.67
          },
          "feels_like": {
            "day": 14.34,
            "night": 8.5,
            "eve": 9.8,
            "morn": 4.77
          },
          "pressure": 1016,
          "humidity": 24,
          "dew_point": -3.33,
          "wind_speed": 1.47,
          "wind_deg": 326,
          "weather": [
            {
              "id": 803,
              "main": "Clouds",
              "description": "broken clouds",
              "icon": "04d"
            }
          ],
          "clouds": 84,
          "pop": 0,
          "uvi": 5.68
        },
        {
          "dt": 1616702400,
          "sunrise": 1616681022,
          "sunset": 1616725469,
          "temp": {
            "day": 14.42,
            "min": 8.72,
            "max": 15.98,
            "night": 8.72,
            "eve": 10.26,
            "morn": 10.18
          },
          "feels_like": {
            "day": 12.32,
            "night": 6.94,
            "eve": 8.04,
            "morn": 6.69
          },
          "pressure": 1009,
          "humidity": 55,
          "dew_point": 5.03,
          "wind_speed": 1.53,
          "wind_deg": 324,
          "weather": [
            {
              "id": 803,
              "main": "Clouds",
              "description": "broken clouds",
              "icon": "04d"
            }
          ],
          "clouds": 77,
          "pop": 0.01,
          "uvi": 6.25
        },
        {
          "dt": 1616788800,
          "sunrise": 1616767331,
          "sunset": 1616811922,
          "temp": {
            "day": 19.04,
            "min": 7.25,
            "max": 19.6,
            "night": 11.05,
            "eve": 12.67,
            "morn": 8.61
          },
          "feels_like": {
            "day": 14.46,
            "night": 9.35,
            "eve": 10.33,
            "morn": 7.1
          },
          "pressure": 1015,
          "humidity": 29,
          "dew_point": -0.1,
          "wind_speed": 3.83,
          "wind_deg": 359,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "clouds": 0,
          "pop": 0,
          "uvi": 6.17
        },
        {
          "dt": 1616875200,
          "sunrise": 1616853640,
          "sunset": 1616898376,
          "temp": {
            "day": 21.2,
            "min": 9.44,
            "max": 21.2,
            "night": 12.2,
            "eve": 14.01,
            "morn": 10.54
          },
          "feels_like": {
            "day": 18.17,
            "night": 11.05,
            "eve": 12.08,
            "morn": 8.39
          },
          "pressure": 1021,
          "humidity": 30,
          "dew_point": 2,
          "wind_speed": 2.17,
          "wind_deg": 320,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "clouds": 0,
          "pop": 0,
          "uvi": 7
        },
        {
          "dt": 1616961600,
          "sunrise": 1616939949,
          "sunset": 1616984829,
          "temp": {
            "day": 21.6,
            "min": 10.46,
            "max": 21.6,
            "night": 11.62,
            "eve": 13.77,
            "morn": 11.52
          },
          "feels_like": {
            "day": 18.39,
            "night": 9.95,
            "eve": 11.62,
            "morn": 10.22
          },
          "pressure": 1022,
          "humidity": 33,
          "dew_point": 3.96,
          "wind_speed": 2.87,
          "wind_deg": 318,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "clouds": 0,
          "pop": 0,
          "uvi": 7
        },
        {
          "dt": 1617048000,
          "sunrise": 1617026258,
          "sunset": 1617071282,
          "temp": {
            "day": 23.25,
            "min": 9.44,
            "max": 23.53,
            "night": 13.81,
            "eve": 15.6,
            "morn": 10.65
          },
          "feels_like": {
            "day": 20.99,
            "night": 13.08,
            "eve": 13.65,
            "morn": 8.36
          },
          "pressure": 1015,
          "humidity": 27,
          "dew_point": 2.03,
          "wind_speed": 1.13,
          "wind_deg": 346,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "clouds": 0,
          "pop": 0,
          "uvi": 7
        },
        {
          "dt": 1617134400,
          "sunrise": 1617112567,
          "sunset": 1617157735,
          "temp": {
            "day": 25.14,
            "min": 12.68,
            "max": 25.14,
            "night": 15.05,
            "eve": 17.37,
            "morn": 14.13
          },
          "feels_like": {
            "day": 23.31,
            "night": 14.16,
            "eve": 16.18,
            "morn": 13.28
          },
          "pressure": 1013,
          "humidity": 33,
          "dew_point": 6.62,
          "wind_speed": 1.85,
          "wind_deg": 315,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "clouds": 0,
          "pop": 0,
          "uvi": 7
        }
      ]
    }
""".trimIndent()

val fakeWeatherDailyHourlyJson = """
    {
      "lat": -33.885,
      "lon": 151.2081,
      "timezone": "Australia/Sydney",
      "timezone_offset": 39600,
      "hourly": [
        {
          "dt": 1616284800,
          "temp": 19.02,
          "feels_like": 13.71,
          "pressure": 1025,
          "humidity": 83,
          "dew_point": 16.07,
          "uvi": 0.4,
          "clouds": 90,
          "visibility": 10000,
          "wind_speed": 10.46,
          "wind_deg": 73,
          "wind_gust": 14.26,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 0.89
          }
        },
        {
          "dt": 1616288400,
          "temp": 19.77,
          "feels_like": 15.06,
          "pressure": 1025,
          "humidity": 82,
          "dew_point": 16.61,
          "uvi": 0.77,
          "clouds": 95,
          "visibility": 10000,
          "wind_speed": 9.9,
          "wind_deg": 67,
          "wind_gust": 13.55,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04d"
            }
          ],
          "pop": 0.85
        },
        {
          "dt": 1616292000,
          "temp": 20.1,
          "feels_like": 15.74,
          "pressure": 1024,
          "humidity": 82,
          "dew_point": 16.93,
          "uvi": 0.83,
          "clouds": 98,
          "visibility": 10000,
          "wind_speed": 9.59,
          "wind_deg": 72,
          "wind_gust": 13.04,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04d"
            }
          ],
          "pop": 0.85
        },
        {
          "dt": 1616295600,
          "temp": 19.85,
          "feels_like": 15.33,
          "pressure": 1023,
          "humidity": 82,
          "dew_point": 16.69,
          "uvi": 0.75,
          "clouds": 99,
          "visibility": 10000,
          "wind_speed": 9.67,
          "wind_deg": 72,
          "wind_gust": 12.51,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10d"
            }
          ],
          "pop": 0.91,
          "rain": {
            "1h": 0.61
          }
        },
        {
          "dt": 1616299200,
          "temp": 19.56,
          "feels_like": 15.75,
          "pressure": 1023,
          "humidity": 81,
          "dew_point": 16.21,
          "uvi": 1.01,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 8.39,
          "wind_deg": 73,
          "wind_gust": 11.78,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10d"
            }
          ],
          "pop": 0.91,
          "rain": {
            "1h": 0.56
          }
        },
        {
          "dt": 1616302800,
          "temp": 19.63,
          "feels_like": 16.42,
          "pressure": 1022,
          "humidity": 81,
          "dew_point": 16.32,
          "uvi": 0.6,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 7.58,
          "wind_deg": 77,
          "wind_gust": 11.41,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10d"
            }
          ],
          "pop": 0.93,
          "rain": {
            "1h": 0.77
          }
        },
        {
          "dt": 1616306400,
          "temp": 20.06,
          "feels_like": 17.16,
          "pressure": 1023,
          "humidity": 78,
          "dew_point": 16.18,
          "uvi": 0.26,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 7.03,
          "wind_deg": 81,
          "wind_gust": 10.87,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10d"
            }
          ],
          "pop": 0.93,
          "rain": {
            "1h": 0.38
          }
        },
        {
          "dt": 1616310000,
          "temp": 20.3,
          "feels_like": 17.43,
          "pressure": 1023,
          "humidity": 79,
          "dew_point": 16.52,
          "uvi": 0.06,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 7.24,
          "wind_deg": 80,
          "wind_gust": 10.61,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10d"
            }
          ],
          "pop": 0.89,
          "rain": {
            "1h": 0.47
          }
        },
        {
          "dt": 1616313600,
          "temp": 20.26,
          "feels_like": 17.43,
          "pressure": 1023,
          "humidity": 80,
          "dew_point": 16.8,
          "uvi": 0,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 7.27,
          "wind_deg": 80,
          "wind_gust": 10.74,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10d"
            }
          ],
          "pop": 0.89,
          "rain": {
            "1h": 0.73
          }
        },
        {
          "dt": 1616317200,
          "temp": 20.19,
          "feels_like": 17.3,
          "pressure": 1023,
          "humidity": 82,
          "dew_point": 16.92,
          "uvi": 0,
          "clouds": 100,
          "visibility": 9135,
          "wind_speed": 7.53,
          "wind_deg": 76,
          "wind_gust": 11.01,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10n"
            }
          ],
          "pop": 0.95,
          "rain": {
            "1h": 0.9
          }
        },
        {
          "dt": 1616320800,
          "temp": 19.86,
          "feels_like": 16.82,
          "pressure": 1024,
          "humidity": 84,
          "dew_point": 17.01,
          "uvi": 0,
          "clouds": 100,
          "visibility": 6211,
          "wind_speed": 7.78,
          "wind_deg": 76,
          "wind_gust": 11.11,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 0.95,
          "rain": {
            "1h": 1.65
          }
        },
        {
          "dt": 1616324400,
          "temp": 19.67,
          "feels_like": 16.44,
          "pressure": 1024,
          "humidity": 85,
          "dew_point": 17.14,
          "uvi": 0,
          "clouds": 100,
          "visibility": 6928,
          "wind_speed": 8.06,
          "wind_deg": 75,
          "wind_gust": 11.59,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 0.95,
          "rain": {
            "1h": 1.92
          }
        },
        {
          "dt": 1616328000,
          "temp": 19.73,
          "feels_like": 16.33,
          "pressure": 1024,
          "humidity": 85,
          "dew_point": 17.24,
          "uvi": 0,
          "clouds": 100,
          "visibility": 6702,
          "wind_speed": 8.33,
          "wind_deg": 73,
          "wind_gust": 12.09,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 0.95,
          "rain": {
            "1h": 1.91
          }
        },
        {
          "dt": 1616331600,
          "temp": 19.94,
          "feels_like": 16.5,
          "pressure": 1023,
          "humidity": 83,
          "dew_point": 17.06,
          "uvi": 0,
          "clouds": 100,
          "visibility": 8701,
          "wind_speed": 8.29,
          "wind_deg": 70,
          "wind_gust": 12,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 0.93,
          "rain": {
            "1h": 1.3
          }
        },
        {
          "dt": 1616335200,
          "temp": 19.83,
          "feels_like": 16.72,
          "pressure": 1023,
          "humidity": 83,
          "dew_point": 16.91,
          "uvi": 0,
          "clouds": 100,
          "visibility": 8656,
          "wind_speed": 7.76,
          "wind_deg": 72,
          "wind_gust": 11.42,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 0.96,
          "rain": {
            "1h": 1.06
          }
        },
        {
          "dt": 1616338800,
          "temp": 19.78,
          "feels_like": 17.08,
          "pressure": 1022,
          "humidity": 84,
          "dew_point": 16.99,
          "uvi": 0,
          "clouds": 100,
          "visibility": 9493,
          "wind_speed": 7.26,
          "wind_deg": 74,
          "wind_gust": 10.65,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 0.95,
          "rain": {
            "1h": 1.15
          }
        },
        {
          "dt": 1616342400,
          "temp": 19.76,
          "feels_like": 16.84,
          "pressure": 1022,
          "humidity": 85,
          "dew_point": 17.16,
          "uvi": 0,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 7.67,
          "wind_deg": 73,
          "wind_gust": 11.21,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 0.98,
          "rain": {
            "1h": 1.11
          }
        },
        {
          "dt": 1616346000,
          "temp": 19.83,
          "feels_like": 16.6,
          "pressure": 1021,
          "humidity": 84,
          "dew_point": 17.13,
          "uvi": 0,
          "clouds": 100,
          "visibility": 9556,
          "wind_speed": 8.04,
          "wind_deg": 74,
          "wind_gust": 11.65,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10n"
            }
          ],
          "pop": 0.98,
          "rain": {
            "1h": 0.92
          }
        },
        {
          "dt": 1616349600,
          "temp": 19.46,
          "feels_like": 16.02,
          "pressure": 1021,
          "humidity": 86,
          "dew_point": 17.08,
          "uvi": 0,
          "clouds": 100,
          "visibility": 5405,
          "wind_speed": 8.34,
          "wind_deg": 69,
          "wind_gust": 11.91,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 0.98,
          "rain": {
            "1h": 1.91
          }
        },
        {
          "dt": 1616353200,
          "temp": 19.23,
          "feels_like": 15.85,
          "pressure": 1021,
          "humidity": 88,
          "dew_point": 17.29,
          "uvi": 0,
          "clouds": 100,
          "visibility": 4534,
          "wind_speed": 8.34,
          "wind_deg": 70,
          "wind_gust": 11.92,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 2.73
          }
        },
        {
          "dt": 1616356800,
          "temp": 19.25,
          "feels_like": 15.84,
          "pressure": 1022,
          "humidity": 88,
          "dew_point": 17.18,
          "uvi": 0,
          "clouds": 100,
          "visibility": 5966,
          "wind_speed": 8.39,
          "wind_deg": 61,
          "wind_gust": 11.89,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 2.8
          }
        },
        {
          "dt": 1616360400,
          "temp": 19.32,
          "feels_like": 16.13,
          "pressure": 1022,
          "humidity": 85,
          "dew_point": 16.75,
          "uvi": 0.49,
          "clouds": 100,
          "visibility": 8489,
          "wind_speed": 7.8,
          "wind_deg": 54,
          "wind_gust": 11.44,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.55
          }
        },
        {
          "dt": 1616364000,
          "temp": 19.21,
          "feels_like": 15.66,
          "pressure": 1022,
          "humidity": 83,
          "dew_point": 16.29,
          "uvi": 0.22,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 8.05,
          "wind_deg": 49,
          "wind_gust": 12.01,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.1
          }
        },
        {
          "dt": 1616367600,
          "temp": 19.08,
          "feels_like": 15.29,
          "pressure": 1023,
          "humidity": 85,
          "dew_point": 16.53,
          "uvi": 0.5,
          "clouds": 100,
          "visibility": 8032,
          "wind_speed": 8.53,
          "wind_deg": 56,
          "wind_gust": 12.47,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.29
          }
        },
        {
          "dt": 1616371200,
          "temp": 19.08,
          "feels_like": 15.43,
          "pressure": 1022,
          "humidity": 87,
          "dew_point": 16.84,
          "uvi": 0.8,
          "clouds": 100,
          "visibility": 7045,
          "wind_speed": 8.53,
          "wind_deg": 57,
          "wind_gust": 12.3,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.66
          }
        },
        {
          "dt": 1616374800,
          "temp": 19.08,
          "feels_like": 14.65,
          "pressure": 1022,
          "humidity": 88,
          "dew_point": 17.03,
          "uvi": 0.79,
          "clouds": 100,
          "visibility": 6026,
          "wind_speed": 9.76,
          "wind_deg": 48,
          "wind_gust": 13.6,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.98
          }
        },
        {
          "dt": 1616378400,
          "temp": 18.89,
          "feels_like": 14.52,
          "pressure": 1022,
          "humidity": 87,
          "dew_point": 16.62,
          "uvi": 0.85,
          "clouds": 100,
          "visibility": 6794,
          "wind_speed": 9.46,
          "wind_deg": 44,
          "wind_gust": 13.29,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.78
          }
        },
        {
          "dt": 1616382000,
          "temp": 18.74,
          "feels_like": 14.31,
          "pressure": 1021,
          "humidity": 86,
          "dew_point": 16.41,
          "uvi": 0.77,
          "clouds": 100,
          "visibility": 7442,
          "wind_speed": 9.36,
          "wind_deg": 49,
          "wind_gust": 13,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.64
          }
        },
        {
          "dt": 1616385600,
          "temp": 18.46,
          "feels_like": 14.56,
          "pressure": 1020,
          "humidity": 88,
          "dew_point": 16.52,
          "uvi": 0.43,
          "clouds": 100,
          "visibility": 6805,
          "wind_speed": 8.65,
          "wind_deg": 54,
          "wind_gust": 12.12,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.67
          }
        },
        {
          "dt": 1616389200,
          "temp": 18.43,
          "feels_like": 14.83,
          "pressure": 1019,
          "humidity": 88,
          "dew_point": 16.54,
          "uvi": 0.25,
          "clouds": 100,
          "visibility": 8785,
          "wind_speed": 8.2,
          "wind_deg": 61,
          "wind_gust": 11.4,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.68
          }
        },
        {
          "dt": 1616392800,
          "temp": 18.38,
          "feels_like": 15.55,
          "pressure": 1018,
          "humidity": 90,
          "dew_point": 16.74,
          "uvi": 0.11,
          "clouds": 100,
          "visibility": 7833,
          "wind_speed": 7.27,
          "wind_deg": 73,
          "wind_gust": 10.28,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.37
          }
        },
        {
          "dt": 1616396400,
          "temp": 18.68,
          "feels_like": 15.1,
          "pressure": 1018,
          "humidity": 91,
          "dew_point": 17.23,
          "uvi": 0.03,
          "clouds": 100,
          "visibility": 4994,
          "wind_speed": 8.62,
          "wind_deg": 80,
          "wind_gust": 12.06,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 2.94
          }
        },
        {
          "dt": 1616400000,
          "temp": 19.04,
          "feels_like": 14.58,
          "pressure": 1018,
          "humidity": 91,
          "dew_point": 17.53,
          "uvi": 0,
          "clouds": 100,
          "visibility": 4050,
          "wind_speed": 10.08,
          "wind_deg": 71,
          "wind_gust": 13.7,
          "weather": [
            {
              "id": 502,
              "main": "Rain",
              "description": "heavy intensity rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 4.65
          }
        },
        {
          "dt": 1616403600,
          "temp": 18.9,
          "feels_like": 14.79,
          "pressure": 1019,
          "humidity": 91,
          "dew_point": 17.37,
          "uvi": 0,
          "clouds": 100,
          "visibility": 4718,
          "wind_speed": 9.5,
          "wind_deg": 55,
          "wind_gust": 13.41,
          "weather": [
            {
              "id": 502,
              "main": "Rain",
              "description": "heavy intensity rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 4.16
          }
        },
        {
          "dt": 1616407200,
          "temp": 18.12,
          "feels_like": 15.16,
          "pressure": 1019,
          "humidity": 92,
          "dew_point": 16.81,
          "uvi": 0,
          "clouds": 100,
          "visibility": 4602,
          "wind_speed": 7.51,
          "wind_deg": 41,
          "wind_gust": 11.15,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 3.62
          }
        },
        {
          "dt": 1616410800,
          "temp": 17.87,
          "feels_like": 15.53,
          "pressure": 1018,
          "humidity": 92,
          "dew_point": 16.62,
          "uvi": 0,
          "clouds": 100,
          "visibility": 4372,
          "wind_speed": 6.48,
          "wind_deg": 35,
          "wind_gust": 10.45,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 3.84
          }
        },
        {
          "dt": 1616414400,
          "temp": 18.35,
          "feels_like": 15.05,
          "pressure": 1018,
          "humidity": 92,
          "dew_point": 17.06,
          "uvi": 0,
          "clouds": 100,
          "visibility": 3479,
          "wind_speed": 8.13,
          "wind_deg": 45,
          "wind_gust": 12.43,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 3.93
          }
        },
        {
          "dt": 1616418000,
          "temp": 18.88,
          "feels_like": 14.12,
          "pressure": 1017,
          "humidity": 89,
          "dew_point": 17.06,
          "uvi": 0,
          "clouds": 100,
          "visibility": 7138,
          "wind_speed": 10.21,
          "wind_deg": 46,
          "wind_gust": 14.23,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 3.24
          }
        },
        {
          "dt": 1616421600,
          "temp": 18.88,
          "feels_like": 14.43,
          "pressure": 1016,
          "humidity": 86,
          "dew_point": 16.56,
          "uvi": 0,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 9.46,
          "wind_deg": 48,
          "wind_gust": 13.23,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 0.99
          }
        },
        {
          "dt": 1616425200,
          "temp": 18.57,
          "feels_like": 13.93,
          "pressure": 1015,
          "humidity": 88,
          "dew_point": 16.52,
          "uvi": 0,
          "clouds": 100,
          "visibility": 10000,
          "wind_speed": 9.76,
          "wind_deg": 58,
          "wind_gust": 13.62,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1
          }
        },
        {
          "dt": 1616428800,
          "temp": 18.66,
          "feels_like": 14.31,
          "pressure": 1013,
          "humidity": 89,
          "dew_point": 16.83,
          "uvi": 0,
          "clouds": 100,
          "visibility": 6906,
          "wind_speed": 9.51,
          "wind_deg": 61,
          "wind_gust": 13.54,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 1.27
          }
        },
        {
          "dt": 1616432400,
          "temp": 18.91,
          "feels_like": 14.65,
          "pressure": 1011,
          "humidity": 91,
          "dew_point": 17.49,
          "uvi": 0,
          "clouds": 100,
          "visibility": 4964,
          "wind_speed": 9.72,
          "wind_deg": 72,
          "wind_gust": 13.8,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 3.41
          }
        },
        {
          "dt": 1616436000,
          "temp": 19.2,
          "feels_like": 14.01,
          "pressure": 1010,
          "humidity": 92,
          "dew_point": 17.8,
          "uvi": 0,
          "clouds": 100,
          "visibility": 4880,
          "wind_speed": 11.32,
          "wind_deg": 79,
          "wind_gust": 15.53,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 3.74
          }
        },
        {
          "dt": 1616439600,
          "temp": 19.72,
          "feels_like": 14.52,
          "pressure": 1010,
          "humidity": 91,
          "dew_point": 18.21,
          "uvi": 0,
          "clouds": 100,
          "visibility": 5928,
          "wind_speed": 11.55,
          "wind_deg": 72,
          "wind_gust": 15.97,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 3.32
          }
        },
        {
          "dt": 1616443200,
          "temp": 19.92,
          "feels_like": 16.13,
          "pressure": 1009,
          "humidity": 92,
          "dew_point": 18.53,
          "uvi": 0,
          "clouds": 100,
          "visibility": 4683,
          "wind_speed": 9.77,
          "wind_deg": 58,
          "wind_gust": 14.24,
          "weather": [
            {
              "id": 502,
              "main": "Rain",
              "description": "heavy intensity rain",
              "icon": "10n"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 4.3
          }
        },
        {
          "dt": 1616446800,
          "temp": 20.01,
          "feels_like": 16.07,
          "pressure": 1008,
          "humidity": 92,
          "dew_point": 18.7,
          "uvi": 0.5,
          "clouds": 100,
          "visibility": 3944,
          "wind_speed": 10.03,
          "wind_deg": 55,
          "wind_gust": 14.88,
          "weather": [
            {
              "id": 502,
              "main": "Rain",
              "description": "heavy intensity rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 4.67
          }
        },
        {
          "dt": 1616450400,
          "temp": 20.32,
          "feels_like": 15.65,
          "pressure": 1007,
          "humidity": 92,
          "dew_point": 19.04,
          "uvi": 0.05,
          "clouds": 100,
          "visibility": 5070,
          "wind_speed": 11.28,
          "wind_deg": 53,
          "wind_gust": 16.48,
          "weather": [
            {
              "id": 502,
              "main": "Rain",
              "description": "heavy intensity rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 5.2
          }
        },
        {
          "dt": 1616454000,
          "temp": 20.75,
          "feels_like": 15.49,
          "pressure": 1006,
          "humidity": 91,
          "dew_point": 19.21,
          "uvi": 0.12,
          "clouds": 100,
          "visibility": 5744,
          "wind_speed": 12.28,
          "wind_deg": 56,
          "wind_gust": 17.78,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "pop": 1,
          "rain": {
            "1h": 2.65
          }
        }
      ],
      "daily": [
        {
          "dt": 1616292000,
          "sunrise": 1616270329,
          "sunset": 1616313961,
          "temp": {
            "day": 20.1,
            "min": 19.02,
            "max": 21.19,
            "night": 19.73,
            "eve": 20.26,
            "morn": 20.49
          },
          "feels_like": {
            "day": 15.74,
            "night": 16.33,
            "eve": 17.43,
            "morn": 16.84
          },
          "pressure": 1024,
          "humidity": 82,
          "dew_point": 16.93,
          "wind_speed": 9.59,
          "wind_deg": 72,
          "weather": [
            {
              "id": 501,
              "main": "Rain",
              "description": "moderate rain",
              "icon": "10d"
            }
          ],
          "clouds": 98,
          "pop": 1,
          "rain": 29.7,
          "uvi": 1.01
        },
        {
          "dt": 1616378400,
          "sunrise": 1616356774,
          "sunset": 1616400278,
          "temp": {
            "day": 18.89,
            "min": 17.87,
            "max": 19.94,
            "night": 18.35,
            "eve": 19.04,
            "morn": 19.25
          },
          "feels_like": {
            "day": 14.52,
            "night": 15.05,
            "eve": 14.58,
            "morn": 15.84
          },
          "pressure": 1022,
          "humidity": 87,
          "dew_point": 16.62,
          "wind_speed": 9.46,
          "wind_deg": 44,
          "weather": [
            {
              "id": 502,
              "main": "Rain",
              "description": "heavy intensity rain",
              "icon": "10d"
            }
          ],
          "clouds": 100,
          "pop": 1,
          "rain": 51.84,
          "uvi": 0.85
        },
        {
          "dt": 1616464800,
          "sunrise": 1616443219,
          "sunset": 1616486596,
          "temp": {
            "day": 21.5,
            "min": 18.57,
            "max": 23.42,
            "night": 21.44,
            "eve": 22.37,
            "morn": 19.92
          },
          "feels_like": {
            "day": 20.73,
            "night": 20.95,
            "eve": 24.09,
            "morn": 16.13
          },
          "pressure": 1003,
          "humidity": 89,
          "dew_point": 19.68,
          "wind_speed": 6.12,
          "wind_deg": 16,
          "weather": [
            {
              "id": 502,
              "main": "Rain",
              "description": "heavy intensity rain",
              "icon": "10d"
            }
          ],
          "clouds": 100,
          "pop": 1,
          "rain": 39.45,
          "uvi": 3.24
        },
        {
          "dt": 1616551200,
          "sunrise": 1616529664,
          "sunset": 1616572914,
          "temp": {
            "day": 25.66,
            "min": 19.8,
            "max": 25.66,
            "night": 21.08,
            "eve": 22.21,
            "morn": 19.8
          },
          "feels_like": {
            "day": 23.44,
            "night": 19.54,
            "eve": 21.47,
            "morn": 17.22
          },
          "pressure": 1000,
          "humidity": 53,
          "dew_point": 15.51,
          "wind_speed": 5.66,
          "wind_deg": 276,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "clouds": 1,
          "pop": 0.17,
          "uvi": 9.02
        },
        {
          "dt": 1616637600,
          "sunrise": 1616616108,
          "sunset": 1616659231,
          "temp": {
            "day": 26.15,
            "min": 19.51,
            "max": 26.15,
            "night": 20.34,
            "eve": 22.68,
            "morn": 19.53
          },
          "feels_like": {
            "day": 24.43,
            "night": 17.29,
            "eve": 22.59,
            "morn": 18.21
          },
          "pressure": 1005,
          "humidity": 48,
          "dew_point": 14.11,
          "wind_speed": 4.39,
          "wind_deg": 243,
          "weather": [
            {
              "id": 800,
              "main": "Clear",
              "description": "clear sky",
              "icon": "01d"
            }
          ],
          "clouds": 0,
          "pop": 0.07,
          "uvi": 8.13
        },
        {
          "dt": 1616724000,
          "sunrise": 1616702552,
          "sunset": 1616745549,
          "temp": {
            "day": 22.73,
            "min": 17.01,
            "max": 22.73,
            "night": 19.6,
            "eve": 20.22,
            "morn": 17.01
          },
          "feels_like": {
            "day": 22.16,
            "night": 19.29,
            "eve": 19.62,
            "morn": 14.41
          },
          "pressure": 1014,
          "humidity": 58,
          "dew_point": 13.86,
          "wind_speed": 2.64,
          "wind_deg": 175,
          "weather": [
            {
              "id": 802,
              "main": "Clouds",
              "description": "scattered clouds",
              "icon": "03d"
            }
          ],
          "clouds": 30,
          "pop": 0.2,
          "uvi": 9
        },
        {
          "dt": 1616810400,
          "sunrise": 1616788997,
          "sunset": 1616831867,
          "temp": {
            "day": 23.74,
            "min": 16.89,
            "max": 24.09,
            "night": 20.06,
            "eve": 21.21,
            "morn": 16.89
          },
          "feels_like": {
            "day": 22.87,
            "night": 19.46,
            "eve": 19.77,
            "morn": 15.89
          },
          "pressure": 1015,
          "humidity": 44,
          "dew_point": 10.77,
          "wind_speed": 1.61,
          "wind_deg": 284,
          "weather": [
            {
              "id": 804,
              "main": "Clouds",
              "description": "overcast clouds",
              "icon": "04d"
            }
          ],
          "clouds": 100,
          "pop": 0,
          "uvi": 9
        },
        {
          "dt": 1616896800,
          "sunrise": 1616875441,
          "sunset": 1616918185,
          "temp": {
            "day": 22.15,
            "min": 17.98,
            "max": 22.15,
            "night": 18.95,
            "eve": 19.41,
            "morn": 18.19
          },
          "feels_like": {
            "day": 20.05,
            "night": 16.79,
            "eve": 17.18,
            "morn": 15.16
          },
          "pressure": 1017,
          "humidity": 66,
          "dew_point": 15.28,
          "wind_speed": 5.57,
          "wind_deg": 150,
          "weather": [
            {
              "id": 500,
              "main": "Rain",
              "description": "light rain",
              "icon": "10d"
            }
          ],
          "clouds": 0,
          "pop": 0.51,
          "rain": 1.11,
          "uvi": 9
        }
      ]
    }
""".trimIndent()
