package binar.academy.carlauncher.animationactivities

import android.animation.AnimatorSet
import android.animation.ValueAnimator

class FlyWithLogoAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    val positionAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
    positionAnimator.addUpdateListener {
      val value = it.animatedValue as Float
      car.translationY = value
      logo.translationY = value
    }

    val rotationAnimator = ValueAnimator.ofFloat(0f, 360f)
    rotationAnimator.addUpdateListener {
      val value = it.animatedValue as Float
      logo.rotation = value
    }

    val animatorSet = AnimatorSet()
    animatorSet.play(positionAnimator).with(rotationAnimator)
    animatorSet.duration = DEFAULT_ANIMATION_DURATION
    animatorSet.start()
  }
}
