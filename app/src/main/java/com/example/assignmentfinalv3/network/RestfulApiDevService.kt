package com.example.assignmentfinalv3.network

import com.example.assignmentfinalv3.data.ResponseItem
import retrofit2.http.GET

interface RestfulApiDevService {
    @GET("objects")
    suspend fun getAllObjects(): List<ResponseItem>
}