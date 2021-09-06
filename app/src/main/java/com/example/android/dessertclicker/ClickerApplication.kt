package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

//separation of concern
//Well designed architecture
class ClickerApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Initializes timber libraries
        Timber.plant(Timber.DebugTree())
    }
}