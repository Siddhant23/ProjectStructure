package com.example.twininterview.android.ui.base

import android.util.Log
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.twininterview.android.data.domain.base.Usecase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel(parentJob: Job? = null) : ViewModel(), LifecycleObserver, CoroutineScope {

    protected val job = SupervisorJob(parentJob)

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }

    protected fun <TIn, TOut> Usecase<TIn, ReceiveChannel<TOut>>.toLiveData(param: TIn): LiveData<TOut?> {
        val liveData = MutableLiveData<TOut?>()
        launch {
            runCatching {
                invoke(param).consumeEach {
                    liveData.value = it
                }
            }.onFailure { exception ->
                Log.e("BaseViewModel", "Failure: ${exception.message}")
            }
        }

        return liveData
    }

    protected fun <T> Usecase<Unit, ReceiveChannel<T>>.toLiveData(): LiveData<T?> =
        toLiveData(Unit)
}
