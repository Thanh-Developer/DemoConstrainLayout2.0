package com.demo.constraint2.contrainstate

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed
import com.demo.constraint2.R
import kotlinx.android.synthetic.main.activity_cl_states_end.*

class ConstraintLayoutStatesActivity : AppCompatActivity() {

    private val handler = Handler()
    private var changed = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cl_states_start)
        stateConstraintLayout.loadLayoutDescription(R.xml.constraint_layout_states)
        setClickListener()
    }

    private fun setClickListener() {
        buttonBakeCake.setOnClickListener {
            stateConstraintLayout.setState(R.id.loading, 0, 0)

            postDelayed(handler, {
                stateConstraintLayout.setState(if (changed) R.id.start else R.id.end, 0, 0)
                if (changed)
                    buttonBakeCake.text = "Login"
                else
                    buttonBakeCake.text = "Try again"
                changed = !changed
            }, null, 3000L)
        }
    }
}
