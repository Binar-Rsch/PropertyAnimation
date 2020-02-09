package binar.academy.carlauncher.animationactivities

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.Toast

class WithListenerAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    val animator = ValueAnimator.ofFloat(0f, -screenHeight)

    animator.addUpdateListener {
      val value = it.animatedValue as Float
      car.translationY = value
      logo.translationY = value
    }

    animator.addListener(object : Animator.AnimatorListener {
      override fun onAnimationStart(animation: Animator) {
        Toast.makeText(applicationContext, "Logo meluncur", Toast.LENGTH_SHORT)
                .show()
      }

      override fun onAnimationEnd(animation: Animator) {
        Toast.makeText(applicationContext, "Logo sudah tiba di pit stop", Toast.LENGTH_SHORT)
                .show()
        finish()
      }

      override fun onAnimationCancel(animation: Animator) {}

      override fun onAnimationRepeat(animation: Animator) {}
    })

    animator.duration = 5000L
    animator.start()
  }
}
