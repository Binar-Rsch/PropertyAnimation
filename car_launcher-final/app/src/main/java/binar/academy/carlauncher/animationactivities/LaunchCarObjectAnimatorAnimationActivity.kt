package binar.academy.carlauncher.animationactivities

import android.animation.ObjectAnimator

class LaunchCarObjectAnimatorAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    val objectAnimator = ObjectAnimator.ofFloat(car, "translationY", 0f, -screenHeight)

    objectAnimator.duration = DEFAULT_ANIMATION_DURATION
    objectAnimator.start()
  }
}
