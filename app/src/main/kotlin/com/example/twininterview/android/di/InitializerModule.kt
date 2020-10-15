package com.example.twininterview.android.di

import com.example.twininterview.android.AppInit
import com.example.twininterview.android.data.domain.initialization.AppInitializer
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
abstract class InitializerModule {

    @Binds
    // @IntoSet
    internal abstract fun mainInitializer(mainInitializer: AppInit): AppInitializer
}