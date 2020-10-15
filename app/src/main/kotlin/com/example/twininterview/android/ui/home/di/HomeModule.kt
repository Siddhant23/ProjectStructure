package com.example.twininterview.android.ui.home.di

import androidx.lifecycle.ViewModel
import com.example.twininterview.android.di.ViewModelKey
import com.example.twininterview.android.ui.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class HomeModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun viewModel(viewModel: HomeViewModel): ViewModel
}
