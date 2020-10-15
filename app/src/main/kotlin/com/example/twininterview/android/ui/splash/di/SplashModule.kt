package com.example.twininterview.android.ui.splash.di

import androidx.lifecycle.ViewModel
import com.example.twininterview.android.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import com.example.twininterview.android.ui.splash.SplashViewModel

@Module
abstract class SplashModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun viewModel(viewModel: SplashViewModel): ViewModel
}
