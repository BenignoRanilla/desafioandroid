package com.example.demo.benignoranilla.service

import com.example.demo.benignoranilla.entities.MovieDataCollectionItem
import retrofit2.Call
import retrofit2.http.GET

interface MovieService {
    @GET("movie/upcoming?page=1&api_key=f46b58478f489737ad5a4651a4b25079")
    fun listUsers(): Call<List<MovieDataCollectionItem>>

}