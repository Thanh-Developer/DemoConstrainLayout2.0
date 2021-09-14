package com.demo.constraint2.recyclerperconstrain

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.demo.constraint2.R
import kotlinx.android.synthetic.main.item5_constraint.view.*

class MoviesRecyclerAdapter(
    private val dataSet: List<Movie>
) : RecyclerView.Adapter<MoviesRecyclerAdapter.MovieViewHolder>() {
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

    fun setData(newDataSet: List<Movie>) {
        (dataSet as ArrayList).clear()
        dataSet.addAll(newDataSet)
        notifyDataSetChanged()
    }

    fun addItem(newItem: Movie) {
        (dataSet as ArrayList).add(0, newItem)
        notifyItemInserted(0)
    }

    fun removeItem() {
        (dataSet as ArrayList).removeAt(1)
        notifyItemRemoved(1)
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