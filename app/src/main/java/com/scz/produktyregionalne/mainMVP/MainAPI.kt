package com.scz.produktyregionalne.mainMVP

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface MainAPI {
    @GET("0/dolnoslaskie.json")
    fun get(): Call<ServerResponse>

    companion object Factory {
        val BASE_URL = "https://produkty-regionalne.firebaseio.com/wojewodztwa/"
        fun create(): MainAPI {
            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()
            return retrofit.create(MainAPI::class.java)
        }
    }
}