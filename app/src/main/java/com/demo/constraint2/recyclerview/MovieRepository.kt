package com.demo.constraint2.recyclerview

import com.demo.constraint2.R

class MovieRepository {
    fun getMovieLists(): List<Pair<Int, Any>> {
        return arrayListOf(
            Pair(R.layout.item_title, "Phim mới"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim HOT trong tuần"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim sắp chiếu"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim mới"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim HOT trong tuần"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim sắp chiếu"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim mới"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim HOT trong tuần"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim sắp chiếu"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim mới"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim HOT trong tuần"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim sắp chiếu"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim mới"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim HOT trong tuần"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim sắp chiếu"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim mới"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim HOT trong tuần"),
            Pair(R.layout.item_new_movies, getMovies()),
            Pair(R.layout.item_title, "Phim sắp chiếu"),
            Pair(R.layout.item_new_movies, getMovies())
        )
    }

    private fun getMovies(): List<Movie> {
        val movies = ArrayList<Movie>()
        for (i in 0..1000) {
            movies.add(
                Movie(
                    "Movie number $i",
                    "https://picsum.photos/id/${i + 10}/200"
                )
            )
        }
        return movies
    }
}