package com.example.assignmentfinalv3.network

import com.example.assignmentfinalv3.data.ResponseItem
import retrofit2.http.GET
import retrofit2.http.Header

interface RestfulApiDevService {
    @GET("footscray/auth")
    suspend fun getAllObjects(): List<ResponseItem>
}