package com.example.assignmentfinalv3.data

// Import packages
import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

// Declare Parcelize
//Additionally identifying the data type of the values.
@Parcelize
data class ResponseItem(
    @Json(name = "name") val name: String,
    @Json(name = "family") val family: String,
    @Json(name = "branch") val branch: String,
    @Json(name = "speakers") val speakers: Int,
    @Json(name = "writingSystem") val writingSystem: String,
    @Json(name = "officialIn") val officialIn: String,
    @Json(name = "description") val description: String
): Parcelable
