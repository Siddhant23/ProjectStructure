package com.example.sid.android.data.domain.base

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import javax.inject.Inject

interface CoroutineScopeFacade {
    val globalScope: CoroutineScope
}

internal class DefaultScopeFacade @Inject constructor(
    contextFacade: CoroutinesContextFacade
) : CoroutineScopeFacade {
    val job = SupervisorJob()
    override val globalScope: CoroutineScope = CoroutineScope(contextFacade.default + job)
}
