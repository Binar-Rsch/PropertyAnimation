package binar.academy.carlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.AccelerateInterpolator

class AccelerateCarAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
    valueAnimator.addUpdateListener {
      val value = it.animatedValue as Float
      car.translationY = value
    }

    valueAnimator.interpolator = AccelerateInterpolator(1.5f)
    valueAnimator.duration = DEFAULT_ANIMATION_DURATION

    valueAnimator.start()
  }
}
