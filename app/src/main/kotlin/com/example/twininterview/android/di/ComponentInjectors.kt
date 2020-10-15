package com.example.twininterview.android.di

import com.example.twininterview.android.ui.main.MainActivity
import com.example.twininterview.android.ui.main.di.MainActivityInjectors
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ComponentInjectors {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityInjectors::class])
    internal abstract fun mainActivity(): MainActivity

}
