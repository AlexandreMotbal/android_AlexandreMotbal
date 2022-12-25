package com.example.flight_app
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.Converter.*
class Generator {

    private val client = OkHttpClient.Builder().build();
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://opensky-network.org/api/states/all")
        .addConverterFactory(GsonConverterFactory.create())
}