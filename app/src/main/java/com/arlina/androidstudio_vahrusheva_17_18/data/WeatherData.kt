package com.arlina.androidstudio_vahrusheva_17_18.data

data class WeatherData(
    val temperature: Int? = null,
    val humidity: Int? = null,
    val windSpeed: Int? = null,
    val isLoading: Boolean = false,
    var error: String? = null,
    val loadingProgress: String = ""
)