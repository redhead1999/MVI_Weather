package com.plcoding.weatherapp

import android.app.Application
import appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WeatherApp: Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@WeatherApp)
            modules(appModule)
        }
    }
}