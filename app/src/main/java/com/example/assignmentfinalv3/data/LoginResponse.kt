package com.example.assignmentfinalv3.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//Identify the keypass which in my case is Languages
@JsonClass(generateAdapter = true)
data class LoginResponse(
    @Json(name = "keypass") val keypass: String
)