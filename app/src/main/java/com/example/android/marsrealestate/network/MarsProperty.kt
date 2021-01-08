package com.example.android.marsrealestate.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

/**
 * This data class defines a Mars property which includes an ID, the image URL, the type (sale
 * or rental) and the price (monthly if it's a rental).
 * The property names of this data class are used by Moshi to match the names of values in JSON.
 */
@Parcelize
data class MarsProperty (
        val date: String,
        val explanation: String,
        val media_type: String,
        val service_version: String,
        val title: String,
        // used to map url from the JSON to url in our class
        @Json(name = "url") val url: String,
        @Json(name = "hdurl") val hdurl: String
) : Parcelable {
        val isRental
                get() = media_type == "image"
}