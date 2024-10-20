package com.example.assignmentfinalv3.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//To verify with the API the login matches with the username and password used to access the API
@JsonClass(generateAdapter = true)
data class LoginRequest (
    @Json(name = "username") val username: String,
    @Json(name = "password") val password: String

)