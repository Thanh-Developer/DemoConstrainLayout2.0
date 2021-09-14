package com.demo.constraint2.constraintset

import android.os.Bundle
import android.transition.TransitionManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.demo.constraint2.R


class CupcakeActivity : AppCompatActivity() {

    private var isLargeLayout = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val constraintSet1 = ConstraintSet()
        val constraintSet2 = ConstraintSet()

        constraintSet2.clone(this, R.layout.activity_cupcake_2)
        setContentView(R.layout.activity_cupcake_1)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraint_layout)
        constraintSet1.clone(constraintLayout)

        val bakeButton = findViewById<Button>(R.id.button_bake)

        bakeButton.setOnClickListener {

            TransitionManager.beginDelayedTransition(constraintLayout)
            if (isLargeLayout) {
                constraintSet1.applyTo(constraintLayout)
            } else {
                constraintSet2.applyTo(constraintLayout)
            }
            isLargeLayout = !isLargeLayout
        }

    }
}