package com.example.android.marsrealestate.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ApodDao {
    @Query("SELECT * FROM apodentity")
    fun getAll(): List<ApodEntity>

    @Query("SELECT * FROM apodentity WHERE uid IN (:apodUrls)")
    fun loadAllByIds(apodUrls: IntArray): List<ApodEntity>

    @Query("SELECT * FROM apodentity WHERE url LIKE :url LIMIT 1")
    fun findByUrl(url: String): ApodEntity

    @Insert
    fun insertAll(vararg apodEntities: ApodEntity)

    @Delete
    fun delete(apodEntity: ApodEntity)
}
