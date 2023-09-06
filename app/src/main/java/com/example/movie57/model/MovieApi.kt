package com.example.movie57.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET(".")
    fun getMovie(
        @Query("t") name: String,
        @Query("apikey") key: String = "23d2f736"
    ): Call<MovieModel>

}