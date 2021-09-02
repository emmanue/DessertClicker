package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

//Well designed architecture
class ClickerApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Initializes timber libraries
        Timber.plant(Timber.DebugTree())
    }
}