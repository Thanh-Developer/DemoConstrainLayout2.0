package com.demo.constraint2.constraintset

import android.os.Bundle
import android.transition.TransitionManager
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import com.demo.constraint2.R
import kotlinx.android.synthetic.main.activity_movie_rental.*

class MovieActivity : AppCompatActivity() {
    private val constraintSet1 = ConstraintSet()
    private val constraintSet2 = ConstraintSet()
    private var isLargeLayout = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_rental)

        initView()

        handleAnimation()
    }

    private fun initView() {
        constraintSet1.clone(movieLayout)
        constraintSet2.clone(this, R.layout.activity_movie_rental_large)
    }

    private fun handleAnimation() {
        imgPoster.setOnClickListener {
            TransitionManager.beginDelayedTransition(movieLayout)
            if (isLargeLayout) {
                constraintSet1.applyTo(movieLayout)
            } else {
                constraintSet2.applyTo(movieLayout)
            }
            isLargeLayout = !isLargeLayout
        }
    }

}
