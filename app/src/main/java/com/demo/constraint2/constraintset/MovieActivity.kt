package com.demo.constraint2.constraintset

import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.appcompat.app.AppCompatActivity
import android.transition.TransitionManager
import com.demo.constraint2.R
import kotlinx.android.synthetic.main.activity_movie_rental.*

class MovieActivity : AppCompatActivity() {

    private var isLargeLayout = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val constraintSet1 = ConstraintSet()
        val constraintSet2 = ConstraintSet()

        constraintSet2.clone(this, R.layout.activity_movie_rental_large)
        setContentView(R.layout.activity_movie_rental)

        constraintSet1.clone(constraint_layout)

        imageview_poster.setOnClickListener {

            TransitionManager.beginDelayedTransition(constraint_layout)
            if (isLargeLayout) {
                constraintSet1.applyTo(constraint_layout)
            } else {
                constraintSet2.applyTo(constraint_layout)
            }
            isLargeLayout = !isLargeLayout
        }
    }
}
