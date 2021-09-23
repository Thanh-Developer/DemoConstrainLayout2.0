package com.demo.constraint2.recyclerview.constrain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.demo.constraint2.R
import com.demo.constraint2.recyclerview.Movie
import com.demo.constraint2.recyclerview.RecyclerViewType
import kotlinx.android.synthetic.main.item_new_movies.view.*
import kotlinx.android.synthetic.main.item_title.view.*

class MainConstrainAdapter(
    private val dataSet: List<Pair<Int, Any>>,
    private val viewTypes: RecyclerViewType
) : RecyclerView.Adapter<MainConstrainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        )
    }

    override fun getItemViewType(position: Int): Int = viewTypes.getViewType(position)

    override fun getItemCount(): Int = dataSet.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        when (viewTypes.getViewType(position)) {
            R.layout.item_title -> holder.bindTitle(dataSet[position].second as String)
            R.layout.item_new_movies -> holder.bindMovies(dataSet[position].second as List<Movie>)
        }
    }

    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindTitle(title: String) {
            itemView.textTitle.text = title
        }

        fun bindMovies(movies: List<Movie>) {
            itemView.recyclerMovies.apply {
                adapter = MoviesContrainAdapter(movies)
                layoutManager =
                    LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            }
        }
    }
}