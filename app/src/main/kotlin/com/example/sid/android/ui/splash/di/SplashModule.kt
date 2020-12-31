package com.example.sid.android.ui.splash.di

import androidx.lifecycle.ViewModel
import com.example.sid.android.di.ViewModelKey
import com.example.sid.android.ui.splash.SplashViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SplashModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun viewModel(viewModel: SplashViewModel): ViewModel
}
