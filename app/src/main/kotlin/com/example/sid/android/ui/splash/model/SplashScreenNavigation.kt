package com.example.sid.android.ui.splash.model

sealed class SplashScreenNavigation {
    object GoToHome : SplashScreenNavigation()
    object GoToSplash : SplashScreenNavigation()
    object ShowError : SplashScreenNavigation()
}