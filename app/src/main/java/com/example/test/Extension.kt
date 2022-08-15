package com.example.test

import android.app.Activity
import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.animation.CycleInterpolator
import android.view.animation.TranslateAnimation

fun Activity.androidDeviceVibrate(duration: Long) {
    val v = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator?
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        v!!.vibrate(VibrationEffect.createOneShot(duration, VibrationEffect.DEFAULT_AMPLITUDE))
    } else {
        v!!.vibrate(duration)
    }
}

fun shakeAnimation(timeInMillis: Long): TranslateAnimation {
    val shake = TranslateAnimation(0F, 10F, 0F, 0F)
    return shake.apply {
        duration = timeInMillis
        interpolator = CycleInterpolator(7F)
    }
}