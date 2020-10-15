package com.example.twininterview.android.data.domain.food.repository

import com.example.twininterview.android.data.domain.food.model.Food
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InMemoryFoodDataRepository @Inject constructor(

) : FoodDataRepository {

    override suspend fun loadFood(): Pair<Boolean?, Throwable?> {
        return Pair(true, null)
    }

    override suspend fun getFood(): Pair<List<Food>?, Throwable?>  {
        return Pair(null, null)
    }
}
