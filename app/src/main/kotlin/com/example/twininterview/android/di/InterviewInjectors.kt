package com.example.twininterview.android.di

import com.example.twininterview.android.data.domain.base.CoroutineScopeFacade
import com.example.twininterview.android.data.domain.base.CoroutinesContextFacade
import com.example.twininterview.android.data.domain.base.DefaultContextFacade
import com.example.twininterview.android.data.domain.base.DefaultScopeFacade
import com.example.twininterview.android.data.domain.food.repository.FoodDataRepository
import com.example.twininterview.android.data.domain.food.repository.InMemoryFoodDataRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import org.threeten.bp.Clock

@Module
abstract class InterviewInjectors {

    @Module
    companion object {

        @Provides
        @JvmStatic
        fun clock() = Clock.systemDefaultZone()
    }

    @Binds
    internal abstract fun dispatchersFacade(implementation: DefaultContextFacade): CoroutinesContextFacade

    @Binds
    internal abstract fun scopeFacade(implementation: DefaultScopeFacade): CoroutineScopeFacade

    @Binds
    internal abstract fun appDataRepo(implementation: InMemoryFoodDataRepository): FoodDataRepository

}
