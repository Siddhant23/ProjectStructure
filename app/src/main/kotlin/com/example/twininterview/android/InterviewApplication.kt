package com.example.twininterview.android

import com.example.twininterview.android.configuration.AppConfigurator
import com.example.twininterview.android.data.domain.initialization.InitializeApplication
import com.example.twininterview.android.data.domain.base.invoke
import com.example.twininterview.android.di.DaggerExampleComponent
import dagger.Lazy
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import javax.inject.Inject

class InterviewApplication : DaggerApplication() {

    @Inject
    internal lateinit var configurators: AppConfigurator

    @Inject
    lateinit var initializeApp: Lazy<InitializeApplication>

    override fun onCreate() {
        super.onCreate()
        runBlocking {
            withContext(Dispatchers.Default) {
                launch { configurators.configure() }
            }
            initializeApp.get().invoke()
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerExampleComponent.builder().create(this)
}
