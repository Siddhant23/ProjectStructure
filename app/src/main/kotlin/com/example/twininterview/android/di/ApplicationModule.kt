package com.example.twininterview.android.di

import android.app.Application
import android.content.Context
import com.example.twininterview.android.InterviewApplication
import com.example.twininterview.android.configuration.AndroidThreeTenConfigurator
import com.example.twininterview.android.configuration.AppConfigurator
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
internal abstract class ApplicationModule {

    @Binds
    abstract fun context(application: InterviewApplication): Context

    @Binds
    abstract fun application(application: InterviewApplication): Application

    @Binds
//    @IntoSet
    abstract fun androidThreeTen(instabug: AndroidThreeTenConfigurator): AppConfigurator
}
