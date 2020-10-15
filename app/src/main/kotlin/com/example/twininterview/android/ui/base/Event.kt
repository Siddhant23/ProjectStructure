package com.example.twininterview.android.ui.base

import androidx.annotation.VisibleForTesting

data class Event<T : Any>(
    @VisibleForTesting val value: T
) {

    @get:Synchronized
    private var hasBeenConsumed = false

    fun consume(consumer: (T) -> Unit) {
        if (!hasBeenConsumed) {
            consumer(value)
            hasBeenConsumed = true
        }
    }
}

fun <T : Any> T.toEvent() = Event(this)
