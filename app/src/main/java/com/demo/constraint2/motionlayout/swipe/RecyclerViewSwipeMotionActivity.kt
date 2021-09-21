package com.demo.constraint2.motionlayout.swipe

import android.content.Context
import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.demo.constraint2.R
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment
import com.google.android.material.shape.CornerTreatment
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.RoundedCornerTreatment
import com.google.android.material.shape.ShapePathModel
import kotlinx.android.synthetic.main.activity_swipe_recycler_view.*
import kotlinx.android.synthetic.main.list_item_email.view.*

class RecyclerViewSwipeMotionActivity : AppCompatActivity() {
    private val listItems = listOf(
        Email("Rebecca Franks", "It's the holidays!"),
        Email("Rebecca Franks", "It's the holidays!"),
        Email("Rebecca Franks", "It's the holidays!"),
        Email("Rebecca Franks", "It's the holidays!"),
        Email("Rebecca Franks", "It's the holidays!"),
        Email("Rebecca Franks", "It's the holidays!"),
        Email("Rebecca Franks", "It's the holidays!"),
        Email("Rebecca Franks", "It's the holidays!"),
        Email("Rebecca Franks", "It's the holidays!"),
        Email("Rebecca Franks", "It's the holidays!")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_recycler_view)
        initView()
        initData()
    }

    private fun initView() {
        val shapePathModel = ShapePathModel().apply {
            val margin = applicationContext.dipToPixels(36f)
            val corner = RoundedCornerTreatment(margin)
            val noCorner = CornerTreatment()
            setCornerTreatments(corner, corner, noCorner, noCorner)
            topEdge = BottomAppBarTopEdgeTreatment(margin, margin, margin)
        }

        val backgroundDrawable = MaterialShapeDrawable(shapePathModel).apply {
            setTint(ContextCompat.getColor(this@RecyclerViewSwipeMotionActivity, R.color.white))
            isShadowEnabled = true
        }
        backgroundView.background = backgroundDrawable
    }

    private fun initData() {
        val emailAdapter = EmailAdapter()

        recyclerViewEmails.apply {
            adapter = emailAdapter
            layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        }

        emailAdapter.submitList(listItems)
    }

    private fun Context.dipToPixels(dipValue: Float) =
        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dipValue, resources.displayMetrics)
}