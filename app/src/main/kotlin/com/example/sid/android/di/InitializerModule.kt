package com.example.sid.android.di

import com.example.sid.android.AppInit
import com.example.sid.android.data.domain.initialization.AppInitializer
import dagger.Binds
import dagger.Module

@Module
abstract class InitializerModule {

    @Binds
    // @IntoSet
    internal abstract fun mainInitializer(mainInitializer: AppInit): AppInitializer
}