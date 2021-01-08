package com.example.android.marsrealestate.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ApodEntity(
        @PrimaryKey(autoGenerate = true) val uid: Int,
        val date: String,
        val explanation: String,
        val media_type: String,
        val service_version: String,
        val title: String,
        val url: String,
        val hdurl: String,
        val isRental: Boolean = false
)
