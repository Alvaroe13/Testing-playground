package com.example.testing_playground.data.cache

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct( product : ShoppingModel)

    @Delete
    suspend fun deleteProduct( product: ShoppingModel)

    @Query("SELECT * FROM shopping_db")
    fun getAllProducts() : LiveData<List<ShoppingModel>>

    @Query("SELECT SUM(price * amount ) FROM shopping_db")
    fun totalPrice(): LiveData<Float>

}