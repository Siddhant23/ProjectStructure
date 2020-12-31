package com.example.sid.android.ui.main.di

import com.example.sid.android.di.FragmentScope
import com.example.sid.android.ui.home.HomeFragment
import com.example.sid.android.ui.home.di.HomeModule
import com.example.sid.android.ui.splash.SplashFragment
import com.example.sid.android.ui.splash.di.SplashModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityInjectors {

    @FragmentScope
    @ContributesAndroidInjector(modules = [SplashModule::class])
    abstract fun splash(): SplashFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun home(): HomeFragment
}
