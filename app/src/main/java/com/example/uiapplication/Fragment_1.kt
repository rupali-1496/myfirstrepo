package com.example.uiapplication
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitproj.Api
import com.example.retrofitproj.MoviesAdapter


class Fragment_1: Fragment() {

    private lateinit var popularMovies: RecyclerView
    private lateinit var popularMoviesAdapter:MoviesAdapter

    override
    fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
          // Inflate the layout for this fragment

      /*  var rt = inflater.inflate(R.id.)
        popularMovies = inflater.inflate(R.id.popular_movies,co
        popularMovies = findViewById(R.id.popular_movies)
        popularMovies.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )


        popularMoviesAdapter = MoviesAdapter(listOf())
        popularMovies.adapter = popularMoviesAdapter


        Api.MoviesRepository.getPopularMovies(
            onSuccess = ::onPopularMoviesFetched,
            onError = ::onError
        )
*/
        return inflater.inflate(R.layout.fragment_1, container, false)
    }
}