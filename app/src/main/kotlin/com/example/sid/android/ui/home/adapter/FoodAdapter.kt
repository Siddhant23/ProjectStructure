package com.example.sid.android.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sid.android.adapter.viewholder.DefaultHolder
import com.example.sid.android.data.domain.food.model.Food
import com.example.sid.android.databinding.ListItemFoodHomeBinding

internal class FoodAdapter(
    val foodItems: List<Food>
) : RecyclerView.Adapter<DefaultHolder<ListItemFoodHomeBinding>>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DefaultHolder<ListItemFoodHomeBinding> {
        val inflater = LayoutInflater.from(parent.context)
        return DefaultHolder(ListItemFoodHomeBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(holder: DefaultHolder<ListItemFoodHomeBinding>, position: Int) {

    }

    override fun getItemCount(): Int {
        return foodItems.size
    }
}
