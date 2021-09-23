package com.demo.constraint2.recyclerview.liner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.demo.constraint2.R
import com.demo.constraint2.recyclerview.MovieRepository
import com.demo.constraint2.recyclerview.RecyclerViewType
import kotlinx.android.synthetic.main.fragment_double_recycler.*

class DoubleRecyclerLinearFragment : Fragment() {
    private val repo: MovieRepository by lazy {
        MovieRepository()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_double_recycler, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val data = repo.getMovieLists()
        recyclerMain.apply {
            layoutManager = LinearLayoutManager(context)

            adapter = MainLinearAdapter(
                data,
                RecyclerViewType().apply {
                    for (i in 0..49 step 2) {
                        addViewType(R.layout.item_title, ViewTypePosition(i, i))
                        addViewType(R.layout.item_new_movies, ViewTypePosition(i + 1, i + 1))
                    }
                }
            )

            addOnItemTouchListener(object : RecyclerView.OnItemTouchListener {
                override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {
                    TODO("Not yet implemented")
                }

                override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
                    if (e.action == MotionEvent.ACTION_DOWN
                        && rv.scrollState == RecyclerView.SCROLL_STATE_SETTLING
                    ) {
                        rv.stopScroll()
                    }
                    return false
                }

                override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {
                    TODO("Not yet implemented")
                }
            })
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = DoubleRecyclerLinearFragment()
    }
}
