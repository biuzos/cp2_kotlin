package br.com.fiap.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.movies.MovieList.Companion.movieList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val movieListAdapter = MovieListAdapter(movieList)

        val movieListRecyclerView = findViewById<RecyclerView>(R.id.movie_list)
        movieListRecyclerView.adapter = movieListAdapter
    }
}







