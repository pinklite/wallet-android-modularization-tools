package com.mycelium.demo.hello

import android.app.Application
import android.util.Log
import com.mycelium.modularizationtools.CommunicationManager

class HelloApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CommunicationManager.init(this)
        try {
            CommunicationManager.getInstance().requestPair("com.mycelium.demo.world")
        } catch (se: SecurityException) {
            Log.w("HelloApplication", se.message)
        }
    }
}