package com.example.sid.android.data.domain.base

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import java.net.ConnectException
import java.net.UnknownHostException
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

interface CoroutinesContextFacade {
    val io: CoroutineContext
    val main: CoroutineContext
    val default: CoroutineContext
    val errorHandler: CoroutineContext
}

internal class DefaultContextFacade @Inject constructor() : CoroutinesContextFacade {
    override val io = Dispatchers.IO
    override val main = Dispatchers.Main
    override val default = Dispatchers.Default
    override val errorHandler = CoroutineExceptionHandler { _, error ->
        when (error.cause) {
            is UnknownHostException, is ConnectException -> {

            }
            else -> throw error
        }
    }
}
