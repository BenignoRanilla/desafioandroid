package com.example.demo.benignoranilla.entities

import java.text.DecimalFormat
import java.util.*
import kotlin.collections.ArrayList

class MovieDataCollection : ArrayList<MovieDataCollectionItem>()

data class MovieDataCollectionItem(
        val dates: Dates,
        val page: String,
        val results: Results,

)

data class Dates(
        val maximun: Date,
        val minimum: Date
)

data class Results (
    val adult: String,
    val backdrop_path: String,
    val genre_ids: Genre_ids,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: String,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: String,
    val vote_average: DecimalFormat,
    val vote_count: Int
)

data class Genre_ids(
        val number: Int

)

