package com.example.twininterview.android.di

import com.example.twininterview.android.InterviewApplication
import com.example.twininterview.android.ui.main.di.MainActivityInjectors
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ApplicationModule::class,
        ComponentInjectors::class,
        InterviewInjectors::class,
        InitializerModule::class,
        InterviewModule::class,
        MainActivityInjectors::class
    ]
)
interface ExampleComponent : AndroidInjector<InterviewApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<InterviewApplication>()
}
