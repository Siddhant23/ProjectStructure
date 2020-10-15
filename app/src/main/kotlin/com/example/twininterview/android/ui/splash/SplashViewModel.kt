package com.example.twininterview.android.ui.splash

import androidx.lifecycle.MutableLiveData
import com.example.twininterview.android.ui.base.BaseViewModel
import com.example.twininterview.android.ui.base.Event
import com.example.twininterview.android.ui.base.toEvent
import com.example.twininterview.android.ui.splash.model.SplashScreenNavigation
import javax.inject.Inject
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel @Inject constructor(

) : BaseViewModel() {
    val navigation = MutableLiveData<Event<SplashScreenNavigation>?>()
    val errorMessage = MutableLiveData<String>()

    fun start() {
        launch {
            delay(SPLASH_DURATION)

            navigation.value = SplashScreenNavigation.GoToHome.toEvent()
        }
    }

    companion object {
        private const val SPLASH_DURATION = 1000L
    }
}
