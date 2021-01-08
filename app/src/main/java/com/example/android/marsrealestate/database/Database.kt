package com.example.android.marsrealestate.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(ApodEntity::class), version = 1)
abstract class Database : RoomDatabase() {
    abstract fun apodDao(): ApodDao
}
