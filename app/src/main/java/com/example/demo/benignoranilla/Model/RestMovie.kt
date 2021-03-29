package com.example.demo.benignoranilla.Model

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RestMovie {

    companion object{
        fun getRestMovie(): Retrofit {
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val movie = OkHttpClient.Builder().addInterceptor(interceptor).build()
            val retrofit = Retrofit.Builder()
                    .baseUrl("https://api.themoviedb.org/3/movie/upcoming?page=1&api_key=f46b58478f489737ad5a4651a4b25079")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(movie)
                    .build()

            return retrofit

        }

    }
}