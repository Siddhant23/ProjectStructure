package com.example.twininterview.android.ui.splash.model

sealed class SplashScreenNavigation {
    object GoToHome : SplashScreenNavigation()
    object GoToSplash : SplashScreenNavigation()
    object ShowError : SplashScreenNavigation()
}