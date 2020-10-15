package com.example.twininterview.android.data.domain.base

interface Usecase<TParam, TResult> {
    suspend operator fun invoke(param: TParam): TResult
}

suspend operator fun <T> Usecase<Unit, T>.invoke() = invoke(Unit)
