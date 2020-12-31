package com.example.sid.android.ui.splash

import androidx.lifecycle.MutableLiveData
import com.example.sid.android.ui.base.BaseViewModel
import com.example.sid.android.ui.base.Event
import com.example.sid.android.ui.base.toEvent
import com.example.sid.android.ui.splash.model.SplashScreenNavigation
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

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
