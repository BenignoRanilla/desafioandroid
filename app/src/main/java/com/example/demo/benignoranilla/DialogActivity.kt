package com.example.demo.benignoranilla

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.example.demo.benignoranilla.Model.RestMovie
import com.example.demo.benignoranilla.entities.MovieDataCollectionItem
import com.example.demo.benignoranilla.service.MovieService
import okhttp3.Call
import retrofit2.Callback
import retrofit2.Response


class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_result)



        val botonMovie = findViewById<Button>(R.id.movie)
        botonMovie.setOnClickListener{setContentView(R.layout.movie_main)}

        val boton = findViewById<Button>(R.id.btnRest)
        boton.setOnClickListener{v -> callServiceGetMovie()}
        }

    private fun callServiceGetMovie() {
        val movieService: MovieService = RestMovie.getRestMovie().create(MovieService::class.java)
        val result: retrofit2.Call<List<MovieDataCollectionItem>> = movieService.listUsers()

        result.enqueue(object : Callback<List<MovieDataCollectionItem>>{
            override fun onFailure(call: retrofit2.Call<List<MovieDataCollectionItem>>, t: Throwable) {
                Toast.makeText(this@DialogActivity, "Error", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                    call: retrofit2.Call<List<MovieDataCollectionItem>>,
                    response: Response<List<MovieDataCollectionItem>>) {
                Toast.makeText(this@DialogActivity, "Ok", Toast.LENGTH_LONG).show()
            }
        })
    }


}