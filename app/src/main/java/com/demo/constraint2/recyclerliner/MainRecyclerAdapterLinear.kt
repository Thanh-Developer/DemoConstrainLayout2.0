package com.demo.constraint2.recyclerliner

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.demo.constraint2.R
import com.demo.constraint2.recyclerperconstrain.RecyclerViewType
import com.demo.constraint2.recyclerperconstrain.Movie
import kotlinx.android.synthetic.main.item_new_movies.view.*
import kotlinx.android.synthetic.main.item_title.view.*

class MainRecyclerAdapterLinear(
    private val dataSet: List<Pair<Int, Any>>,
    private val viewTypes: RecyclerViewType
) : RecyclerView.Adapter<MainRecyclerAdapterLinear.MainViewHolder>() {
    private val viewPool by lazy {
        RecyclerView.RecycledViewPool().apply {
            setMaxRecycledViews(R.layout.item_new_movies, 10)
            setMaxRecycledViews(0, 10)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
        //return MainViewHolder(v, viewPool)
        return MainViewHolder(v, null)
    }

    override fun getItemViewType(position: Int): Int {
        return viewTypes.getViewType(position)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        when (viewTypes.getViewType(position)) {
            R.layout.item_title -> holder.bindTitle(dataSet[position].second as String)
            R.layout.item_new_movies -> holder.bindMovies(dataSet[position].second as List<Movie>)
        }
    }

    inner class MainViewHolder(itemView: View, viewPool: RecyclerView.RecycledViewPool?) :
        RecyclerView.ViewHolder(itemView) {
        fun bindTitle(title: String) {
            itemView.textTitle.text = title
        }

        fun bindMovies(movies: List<Movie>) {
            itemView.recyclerMovies.adapter = MoviesRecyclerAdapterLinear(movies)
            itemView.recyclerMovies.layoutManager =
                LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            //itemView.recyclerMovies.setRecycledViewPool(viewPool)
        }
    }
}