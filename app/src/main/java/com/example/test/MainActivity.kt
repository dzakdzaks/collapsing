package com.example.test

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        findViewById<CollapsingToolbar>(R.id.constraintToolbar).onHeaderOffsetChanged = object : CollapsingToolbar.OnHeaderOffsetChanged {
//            override fun onChanged(progress: Float) {
//                // e.g. 24sp zoom to 18sp
//                findViewById<TextView>(R.id.name).textSize = 24 - 6 * progress
//            }
//
//        }
//        with(findViewById<PinEntryEditText>(R.id.etOtp)) {
//            focus()
//            setOnPinCompletedListener {
//                if (it.toString() == "1234") {
//                    Toast.makeText(this@MainActivity, it.toString(), Toast.LENGTH_SHORT).show()
//                } else {
//                    setError(this)
//                }
//            }
//        }
    }

    private fun setError(pinEntryEditText: PinEntryEditText) {
        with(pinEntryEditText) {
            isError = true
            androidDeviceVibrate(300)
            startAnimation(shakeAnimation(600))
        }
    }


}