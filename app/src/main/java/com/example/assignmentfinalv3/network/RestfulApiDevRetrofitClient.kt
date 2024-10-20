package com.example.assignmentfinalv3.network
//This is the RestfulApiDevRetrofitClient.kt dependencies in order to run the activity file.
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

// Purpose of RestfulApiDevRetrofitClient file:
// - Creates a Retrofit client for making network requests
// - Configures logging for request and response bodies
// - Uses Moshi to parse JSON into Kotlin objects
// - Provides API service for interacting with the backend
// - Due to the complications i was facing and not getting the file working, the API was not fully functional as i did not have the code working in order to implement it into my code.

// Creates Retrofit client for API
class RestfulApiDevRetrofitClient {

    // Base URL for the API
    private val BASE_URL = "https://nit3213-api-h2b3-latest.onrender.com"

    // Logging interceptor to debug requests/responses
    private val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    // OkHttpClient with logging
    private val client = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    // Moshi for JSON parsing
    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    // Retrofit setup with Moshi and OkHttpClient
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .client(client)
        .build()

    // API service for making requests
    val apiService: RestfulApiDevService = retrofit.create(RestfulApiDevService::class.java)
}
