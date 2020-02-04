package binar.academy.carlauncher.animationactivities

import android.animation.ValueAnimator

class FlyAndBackAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    val animator = ValueAnimator.ofFloat(0f, -screenHeight)

    animator.addUpdateListener {
      val value = it.animatedValue as Float
      car.translationY = value
      logo.translationY = value
    }

    animator.repeatMode = ValueAnimator.REVERSE
    animator.repeatCount = 3

    animator.duration = 500L
    animator.start()
  }
}
