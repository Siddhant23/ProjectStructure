package com.example.sid.android.di

import android.app.Application
import android.content.Context
import com.example.sid.android.InterviewApplication
import com.example.sid.android.configuration.AndroidThreeTenConfigurator
import com.example.sid.android.configuration.AppConfigurator
import dagger.Binds
import dagger.Module

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
