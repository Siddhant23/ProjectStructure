package com.example.sid.android.data.domain.initialization

import com.example.sid.android.data.domain.base.CoroutinesContextFacade
import com.example.sid.android.data.domain.base.Usecase
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import javax.inject.Inject

class InitializeApplication @Inject constructor(
    private val initializers: AppInitializer, //Set<@JvmSuppressWildcards AppInitializer>
    private val contextFacade: CoroutinesContextFacade
) : Usecase<Unit, Unit> {

    override suspend fun invoke(param: Unit) = coroutineScope {
        withContext(contextFacade.default) {
            initializers.initialize()
        }
    }
}
