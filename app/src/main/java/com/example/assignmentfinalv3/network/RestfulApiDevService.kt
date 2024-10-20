package com.example.assignmentfinalv3.network

import com.example.assignmentfinalv3.data.ResponseItem
import retrofit2.http.GET
import retrofit2.http.Header

//This interface is to be able to interact the API and retrieve information from the API
//Additional code is required of the keypass and the dashboard as the endpoint URL
interface RestfulApiDevService {
    @GET("footscray/auth")
    suspend fun getAllObjects(): List<ResponseItem>
}