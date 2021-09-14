package com.example.democonstraint20

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import androidx.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.system.measureNanoTime

@RunWith(AndroidJUnit4::class)
class LayoutTest {

    private val layoutInflater by lazy { LayoutInflater.from(getInstrumentation().targetContext) }

    companion object {
        private const val TAG = "ThanhTest"

        private const val REPEATS = 1_000

        private const val LINEAR = "linear:\t\t"
        private const val FRAME = "frame:\t\t"
        private const val RELATIVE = "relative:\t\t"
        private const val CONSTRAINT = "constraint:\t"
    }

    @Test
    fun test_item1() {
        Log.i(TAG, "test 1")
        Log.i(TAG, "$CONSTRAINT ${measureTime(R.layout.test1_constraint)}")
        Log.i(TAG, "$LINEAR ${measureTime(R.layout.test1_linear)}")
    }

    @Test
    fun test_item2() {
        Log.i(TAG, "test 2")
        Log.i(TAG, "$CONSTRAINT ${measureTime(R.layout.test2_constraint)}")
        Log.i(TAG, "$LINEAR ${measureTime(R.layout.test2_linear)}")
        Log.i(TAG, "$RELATIVE ${measureTime(R.layout.test2_relative)}")
        Log.i(TAG, "$FRAME ${measureTime(R.layout.test2_frame)}")
    }

    @Test
    fun test_item3() {
        Log.i(TAG, "test 3")
        Log.i(TAG, "$CONSTRAINT ${measureTime(R.layout.test3_constraint)}")
        Log.i(TAG, "$LINEAR ${measureTime(R.layout.test3_linear)}")
        Log.i(TAG, "$RELATIVE ${measureTime(R.layout.test3_relative)}")
    }

    @Test
    fun test_item4() {
        Log.i(TAG, "test 4")
        Log.i(TAG, "$CONSTRAINT ${measureTime(R.layout.test4_constraint)}")
        Log.i(TAG, "$LINEAR ${measureTime(R.layout.test4_linear)}")
    }

    @Test
    fun test_item5() {
        Log.i(TAG, "test 5")
        Log.i(TAG, "$CONSTRAINT ${measureTime(R.layout.test5_constraint)}")
        Log.i(TAG, "$LINEAR ${measureTime(R.layout.test5_linear)}")
    }

    @Test
    fun test_item6() {
        Log.i(TAG, "test 6")
        Log.i(TAG, "$CONSTRAINT ${measureTime(R.layout.test6_constraint)}")
        Log.i(TAG, "$LINEAR ${measureTime(R.layout.test6_linear)}")
    }

    private fun measureTime(@LayoutRes layoutRes: Int): Long {
        return measureTimeInNano(layoutRes) / REPEATS
    }

    private fun measureTimeInNano(@LayoutRes layoutRes: Int) = measureNanoTime {
        for (i in 0 until REPEATS) {
            layoutInflater.inflate(layoutRes, null).apply {
                layoutParams = ViewGroup.LayoutParams(0, 0)
                measure(
                    View.MeasureSpec.makeMeasureSpec(1000, View.MeasureSpec.EXACTLY),
                    View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
                )
                layout(0, 0, measuredWidth, measuredHeight)
            }
        }
    }

}
