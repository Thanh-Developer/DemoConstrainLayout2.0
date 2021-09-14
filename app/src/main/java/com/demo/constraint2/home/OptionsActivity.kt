package com.demo.constraint2.home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.demo.constraint2.R
import com.demo.constraint2.circular.CircularConstraintActivity
import com.demo.constraint2.constraintset.CupcakeActivity
import com.demo.constraint2.constraintset.MovieActivity
import com.demo.constraint2.contrainstate.ConstraintLayoutStatesExampleActivity
import com.demo.constraint2.miagefilter.ImageFilterViewActivity
import com.demo.constraint2.motionlayout.MotionActivity
import com.demo.constraint2.motionlayout.MotionBasicActivity
import com.demo.constraint2.motionlayout.MotionKeyFrameActivity
import com.demo.constraint2.motionlayout.RecyclerViewSwipeMotionActivity
import com.demo.constraint2.recyclerliner.LinearActivity
import com.demo.constraint2.recyclerperconstrain.ConstrainActivity
import kotlinx.android.synthetic.main.activity_options.*

class OptionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)
        val buttonMovie = findViewById<Button>(R.id.button_movie)
        buttonMovie.setOnClickListener { startActivity(Intent(this, MovieActivity::class.java)) }
        val cupcakeDemo = findViewById<Button>(R.id.button_cupcake)
        cupcakeDemo.setOnClickListener { startActivity(Intent(this, CupcakeActivity::class.java)) }

        val circularConstraintDemo = findViewById<Button>(R.id.button_circular_demo)
        circularConstraintDemo.setOnClickListener {
            startActivity(
                Intent(this, CircularConstraintActivity::class.java)
            )
        }

        val imageFilterDemo = findViewById<Button>(R.id.buttonImageFilterView)
        imageFilterDemo.setOnClickListener {
            startActivity(Intent(this, ImageFilterViewActivity::class.java))
        }

        buttonClStates.setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutStatesExampleActivity::class.java))
        }

        buttonSwipeRecyclerView.setOnClickListener {
            startActivity(Intent(this, RecyclerViewSwipeMotionActivity::class.java))
        }

        buttonMotionCompare.setOnClickListener {
            startActivity(Intent(this, MotionActivity::class.java))
        }

        buttonKeyFrame.setOnClickListener {
            startActivity(Intent(this, MotionKeyFrameActivity::class.java))
        }

        buttonMotionBasic.setOnClickListener {
            startActivity(Intent(this, MotionBasicActivity::class.java))
        }

        button_recycler_linear.setOnClickListener {
            startActivity(Intent(this, LinearActivity::class.java))
        }

        button_recycler_constrain.setOnClickListener {
            startActivity(Intent(this, ConstrainActivity::class.java))
        }

    }
}

