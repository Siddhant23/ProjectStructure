package com.example.twininterview.android.di

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ServiceScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ReceiverScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FragmentScope