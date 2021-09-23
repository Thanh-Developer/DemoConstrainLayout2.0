package com.demo.constraint2.recyclerview.constrain

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.demo.constraint2.R
import com.demo.constraint2.recyclerview.Movie
import kotlinx.android.synthetic.main.item5_constraint.view.*

class MoviesContrainAdapter(
    private val dataSet: List<Movie>
) : RecyclerView.Adapter<MoviesContrainAdapter.MovieViewHolder>() {
    private var countViewHolder = 0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item5_constraint, parent, false)
        countViewHolder++
        Log.d("Count ViewHolders", countViewHolder.toString())
        return MovieViewHolder(v)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textTitle = itemView.textTitle
        private val imageView = itemView.imageView

        fun bind(movie: Movie) {
            textTitle.text = movie.title
            Glide.with(itemView.context)
                .load(movie.imageUrl)
                .into(imageView)
        }
    }
}