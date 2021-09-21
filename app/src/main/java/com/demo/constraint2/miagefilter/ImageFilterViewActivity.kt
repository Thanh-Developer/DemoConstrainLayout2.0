package com.demo.constraint2.miagefilter

import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.demo.constraint2.R
import kotlinx.android.synthetic.main.activity_image_filter.*

class ImageFilterViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_filter)
        setupSeekBars()
    }

    private fun setupSeekBars() {
        seekBarSaturation.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekbar: SeekBar?, progress: Int, p2: Boolean) {
                val percentage = (progress / 100.0f)
                imageFilterView.saturation = (percentage) + 1
            }

            override fun onStartTrackingTouch(seekbar: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(seekbar: SeekBar?) {
                TODO("Not yet implemented")
            }
        })

        seekBarContrast.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, p2: Boolean) {
                val percentage = (progress / 100.0f)
                imageFilterView.contrast = (percentage) + 1
            }

            override fun onStartTrackingTouch(seekbar: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(seekbar: SeekBar?) {
                TODO("Not yet implemented")
            }
        })

        seekBarWarmth.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekbar: SeekBar?, progress: Int, p2: Boolean) {
                val percentage = (progress / 100.0f)
                imageFilterView.warmth = (percentage) + 1
            }

            override fun onStartTrackingTouch(seekbar: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(seekbar: SeekBar?) {
                TODO("Not yet implemented")
            }
        })
    }
}