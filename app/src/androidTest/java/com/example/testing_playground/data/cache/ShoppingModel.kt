package com.example.testing_playground.data.cache

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity( tableName = "shopping_db")
class ShoppingModel(
    private var product: String,
    private var amount : Int,
    private var price: Float,
    private var imageUrl: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)