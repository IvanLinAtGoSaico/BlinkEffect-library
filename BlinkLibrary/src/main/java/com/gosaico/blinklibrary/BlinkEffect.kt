package com.gosaico.blinklibrary

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.graphics.Color
import android.view.View
import android.view.animation.Animation

object BlinkEffect {
    fun blink(view: View) {
        val animator: ObjectAnimator = ObjectAnimator.ofInt(
            view,
            "backgroundColor",
            Color.YELLOW,
            Color.RED,
            Color.GREEN,
        )

        animator.apply {
            duration = 500
            setEvaluator(ArgbEvaluator())
            repeatMode = ValueAnimator.REVERSE
            repeatCount = Animation.INFINITE
        }
        animator.start()
    }
}