package binar.academy.carlauncher.animationactivities

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import binar.academy.carlauncher.R


abstract class BaseAnimationActivity : AppCompatActivity() {
    protected lateinit var car: View
    protected lateinit var logo: View
    protected lateinit var frameLayout: View
    protected var screenHeight = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_base_animation)

        car = findViewById(R.id.car)
        logo = findViewById(R.id.logo)
        frameLayout = findViewById(R.id.container)
        frameLayout.setOnClickListener { onStartAnimation() }
    }

    override fun onResume() {
        super.onResume()

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        screenHeight = displayMetrics.heightPixels.toFloat()
    }

    protected abstract fun onStartAnimation()

    companion object {
        val DEFAULT_ANIMATION_DURATION = 2500L
    }
}
