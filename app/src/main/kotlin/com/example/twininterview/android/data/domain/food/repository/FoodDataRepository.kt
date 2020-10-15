package com.example.twininterview.android.data.domain.food.repository

import com.example.twininterview.android.data.domain.food.model.Food

interface FoodDataRepository {
    suspend fun loadFood(): Pair<Boolean?, Throwable?>
    suspend fun getFood(): Pair<List<Food>?, Throwable?>
}
