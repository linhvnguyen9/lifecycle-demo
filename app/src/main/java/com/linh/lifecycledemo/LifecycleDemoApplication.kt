package com.linh.lifecycledemo

import android.app.Application
import timber.log.Timber

class LifecycleDemoApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        initTimber()
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }
}