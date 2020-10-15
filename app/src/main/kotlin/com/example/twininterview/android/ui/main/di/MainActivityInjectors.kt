package com.example.twininterview.android.ui.main.di

import com.example.twininterview.android.di.FragmentScope
import com.example.twininterview.android.ui.home.HomeFragment
import com.example.twininterview.android.ui.home.di.HomeModule
import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.example.twininterview.android.ui.splash.SplashFragment
import com.example.twininterview.android.ui.splash.di.SplashModule

@Module
abstract class MainActivityInjectors {

    @FragmentScope
    @ContributesAndroidInjector(modules = [SplashModule::class])
    abstract fun splash(): SplashFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun home(): HomeFragment
}
