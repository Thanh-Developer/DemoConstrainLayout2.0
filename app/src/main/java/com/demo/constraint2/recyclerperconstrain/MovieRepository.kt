package com.demo.constraint2.recyclerperconstrain

import com.demo.constraint2.R
import com.demo.constraint2.recyclerperconstrain.Movie

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

    fun getMovie(): Movie {
        return Movie(
            "Movie number XXX",
            "https://picsum.photos/id/845/200"
        )
    }

    fun getMovies(): List<Movie> {
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
        /* return arrayListOf(
             Movie(
                 "John Wick 3",
                 "https://m.media-amazon.com/images/M/MV5BMDg2YzI0ODctYjliMy00NTU0LTkxODYtYTNkNjQwMzVmOTcxXkEyXkFqcGdeQXVyNjg2NjQwMDQ@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "The Sun Is Also a Star",
                 "https://m.media-amazon.com/images/M/MV5BMDhiNzUzYTItMWFjYS00ZDUwLWIxNTItMTlmMzAxZjNmMTJkXkEyXkFqcGdeQXVyNjg3MDMxNzU@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "A Dog's Journey",
                 "https://m.media-amazon.com/images/M/MV5BMjE1ZTYwNTktYmIzNy00NDAxLTliYjgtOWFlYWQ5NjA3Mzg3XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "De De Pyaar De",
                 "https://m.media-amazon.com/images/M/MV5BMTBhY2UxNTYtODUzZC00ZTJkLTk2NzAtNGM5NmQzMDRmZWRiXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_UY209_CR2,0,140,209_AL_.jpg"
             ),
             Movie(
                 "John Wick 3",
                 "https://m.media-amazon.com/images/M/MV5BMDg2YzI0ODctYjliMy00NTU0LTkxODYtYTNkNjQwMzVmOTcxXkEyXkFqcGdeQXVyNjg2NjQwMDQ@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "The Sun Is Also a Star",
                 "https://m.media-amazon.com/images/M/MV5BMDhiNzUzYTItMWFjYS00ZDUwLWIxNTItMTlmMzAxZjNmMTJkXkEyXkFqcGdeQXVyNjg3MDMxNzU@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "A Dog's Journey",
                 "https://m.media-amazon.com/images/M/MV5BMjE1ZTYwNTktYmIzNy00NDAxLTliYjgtOWFlYWQ5NjA3Mzg3XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "De De Pyaar De",
                 "https://m.media-amazon.com/images/M/MV5BMTBhY2UxNTYtODUzZC00ZTJkLTk2NzAtNGM5NmQzMDRmZWRiXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_UY209_CR2,0,140,209_AL_.jpg"
             ),
             Movie(
                 "John Wick 3",
                 "https://m.media-amazon.com/images/M/MV5BMDg2YzI0ODctYjliMy00NTU0LTkxODYtYTNkNjQwMzVmOTcxXkEyXkFqcGdeQXVyNjg2NjQwMDQ@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "The Sun Is Also a Star",
                 "https://m.media-amazon.com/images/M/MV5BMDhiNzUzYTItMWFjYS00ZDUwLWIxNTItMTlmMzAxZjNmMTJkXkEyXkFqcGdeQXVyNjg3MDMxNzU@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "A Dog's Journey",
                 "https://m.media-amazon.com/images/M/MV5BMjE1ZTYwNTktYmIzNy00NDAxLTliYjgtOWFlYWQ5NjA3Mzg3XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "De De Pyaar De",
                 "https://m.media-amazon.com/images/M/MV5BMTBhY2UxNTYtODUzZC00ZTJkLTk2NzAtNGM5NmQzMDRmZWRiXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_UY209_CR2,0,140,209_AL_.jpg"
             ),
             Movie(
                 "John Wick 3",
                 "https://m.media-amazon.com/images/M/MV5BMDg2YzI0ODctYjliMy00NTU0LTkxODYtYTNkNjQwMzVmOTcxXkEyXkFqcGdeQXVyNjg2NjQwMDQ@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "The Sun Is Also a Star",
                 "https://m.media-amazon.com/images/M/MV5BMDhiNzUzYTItMWFjYS00ZDUwLWIxNTItMTlmMzAxZjNmMTJkXkEyXkFqcGdeQXVyNjg3MDMxNzU@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "A Dog's Journey",
                 "https://m.media-amazon.com/images/M/MV5BMjE1ZTYwNTktYmIzNy00NDAxLTliYjgtOWFlYWQ5NjA3Mzg3XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "De De Pyaar De",
                 "https://m.media-amazon.com/images/M/MV5BMTBhY2UxNTYtODUzZC00ZTJkLTk2NzAtNGM5NmQzMDRmZWRiXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_UY209_CR2,0,140,209_AL_.jpg"
             ),
             Movie(
                 "John Wick 3",
                 "https://m.media-amazon.com/images/M/MV5BMDg2YzI0ODctYjliMy00NTU0LTkxODYtYTNkNjQwMzVmOTcxXkEyXkFqcGdeQXVyNjg2NjQwMDQ@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "The Sun Is Also a Star",
                 "https://m.media-amazon.com/images/M/MV5BMDhiNzUzYTItMWFjYS00ZDUwLWIxNTItMTlmMzAxZjNmMTJkXkEyXkFqcGdeQXVyNjg3MDMxNzU@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "A Dog's Journey",
                 "https://m.media-amazon.com/images/M/MV5BMjE1ZTYwNTktYmIzNy00NDAxLTliYjgtOWFlYWQ5NjA3Mzg3XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX140_CR0,0,140,209_AL_.jpg"
             ),
             Movie(
                 "De De Pyaar De",
                 "https://m.media-amazon.com/images/M/MV5BMTBhY2UxNTYtODUzZC00ZTJkLTk2NzAtNGM5NmQzMDRmZWRiXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_UY209_CR2,0,140,209_AL_.jpg"
             )
         )*/
    }

    fun getAFewMovies(): List<Movie> {
        val movies = ArrayList<Movie>()
        for (i in 0..100) {
            movies.add(
                Movie(
                    "Movie number $i",
                    "https://picsum.photos/id/$i/200"
                )
            )
        }
        return movies
    }
}