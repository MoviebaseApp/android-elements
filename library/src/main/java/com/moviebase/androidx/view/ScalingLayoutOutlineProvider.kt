package com.moviebase.androidx.view

import android.content.Context
import android.content.res.Resources
import android.graphics.Outline
import android.view.View
import android.view.ViewOutlineProvider
import com.moviebase.ktx.content.toPx

fun imageOutlineProvider(dp: Int): ViewOutlineProvider {
    val radius = dp.px.toFloat()
    return ScalingLayoutOutlineProvider(radius)
}

class ScalingLayoutOutlineProvider(private val radius: Float) : ViewOutlineProvider() {

    override fun getOutline(view: View, outline: Outline) {
        outline.setRoundRect(0, 0, view.width, view.height, radius)
    }
}
