package binar.academy.carlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class LaunchCarValueAnimatorAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)

    valueAnimator.addUpdateListener {
      val value = it.animatedValue as Float
      car.translationY = value
    }

    valueAnimator.interpolator = LinearInterpolator()
    valueAnimator.duration = DEFAULT_ANIMATION_DURATION

    valueAnimator.start()
  }
}
