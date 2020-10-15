package com.example.twininterview.android

import android.app.Application
import android.util.Log
import com.example.twininterview.android.data.domain.initialization.AppInitializer
import javax.inject.Inject

class AppInit @Inject constructor(
    private val application: Application
) : AppInitializer {
    override suspend fun initialize() {
        Log.d("AppInit", "App initialized")
    }
}
