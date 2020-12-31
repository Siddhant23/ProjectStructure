package com.example.sid.android.di

import com.example.sid.android.InterviewApplication
import com.example.sid.android.ui.main.di.MainActivityInjectors
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
