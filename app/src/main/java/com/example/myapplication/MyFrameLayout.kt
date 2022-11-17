package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.FrameLayout

class MyFrameLayout: FrameLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        Log.d("FrameLayout", "FrameLayout onMeasure")
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        var hm = 1500
        if (hm != heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(hm, MeasureSpec.EXACTLY))
            setMeasuredDimension(measuredWidth, hm)
        }
    }
}