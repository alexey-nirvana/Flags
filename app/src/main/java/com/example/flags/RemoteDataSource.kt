package com.example.flags

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface RestCountriesApi {
    @GET("name/{name}")
    suspend fun getCountryByName(@Path("name") cityName: String): List<Country>
}

var retrofit = Retrofit.Builder()
    .baseUrl("https://restcountries.com/v2/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val restCountriesApi = retrofit.create(RestCountriesApi::class.java)