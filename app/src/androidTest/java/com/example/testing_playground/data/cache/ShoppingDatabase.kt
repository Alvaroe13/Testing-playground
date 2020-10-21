package com.example.testing_playground.data.cache

import androidx.room.Database
import androidx.room.RoomDatabase

@Database( entities = [ShoppingModel::class],  version = 1)
abstract class ShoppingDatabase: RoomDatabase() {

    abstract fun getDao() : ShoppingDao


}