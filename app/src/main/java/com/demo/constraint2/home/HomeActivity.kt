package com.demo.constraint2.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.demo.constraint2.R
import com.demo.constraint2.circular.CircularActivity
import com.demo.constraint2.constraintset.CupcakeActivity
import com.demo.constraint2.constraintset.MovieActivity
import com.demo.constraint2.contrainstate.ConstraintLayoutStatesActivity
import com.demo.constraint2.miagefilter.ImageFilterViewActivity
import com.demo.constraint2.motionlayout.cordinator.MotionActivity
import com.demo.constraint2.motionlayout.basic.MotionBasicActivity
import com.demo.constraint2.motionlayout.keyframe.MotionKeyFrameActivity
import com.demo.constraint2.motionlayout.swipe.RecyclerViewSwipeMotionActivity
import com.demo.constraint2.recyclerview.liner.LinearActivity
import com.demo.constraint2.recyclerview.constrain.ConstrainActivity
import kotlinx.android.synthetic.main.activity_options.*

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)
        viewListener()
    }

    private fun viewListener() {
        btnMovie.setOnClickListener(this)
        btnCupcake.setOnClickListener(this)
        btnCircular.setOnClickListener(this)
        btnImageFilterView.setOnClickListener(this)
        btnClStates.setOnClickListener(this)
        btnSwipeRecyclerView.setOnClickListener(this)
        btnMotionCompareCoordinator.setOnClickListener(this)
        btnKeyFrame.setOnClickListener(this)
        btnMotionBasic.setOnClickListener(this)
        btnRecyclerLinear.setOnClickListener(this)
        btnRecyclerConstrain.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnMovie ->
                startActivity(Intent(this, MovieActivity::class.java))
            R.id.btnCupcake ->
                startActivity(Intent(this, CupcakeActivity::class.java))
            R.id.btnCircular ->
                startActivity(Intent(this, CircularActivity::class.java))
            R.id.btnImageFilterView ->
                startActivity(Intent(this, ImageFilterViewActivity::class.java))
            R.id.btnClStates ->
                startActivity(Intent(this, ConstraintLayoutStatesActivity::class.java))
            R.id.btnSwipeRecyclerView ->
                startActivity(Intent(this, RecyclerViewSwipeMotionActivity::class.java))
            R.id.btnMotionCompareCoordinator ->
                startActivity(Intent(this, MotionActivity::class.java))
            R.id.btnKeyFrame ->
                startActivity(Intent(this, MotionKeyFrameActivity::class.java))
            R.id.btnMotionBasic ->
                startActivity(Intent(this, MotionBasicActivity::class.java))
            R.id.btnRecyclerLinear ->
                startActivity(Intent(this, LinearActivity::class.java))
            R.id.btnRecyclerConstrain ->
                startActivity(Intent(this, ConstrainActivity::class.java))
        }
    }
}

