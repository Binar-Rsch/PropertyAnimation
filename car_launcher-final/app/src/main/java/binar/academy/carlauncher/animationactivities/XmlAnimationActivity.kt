package binar.academy.carlauncher.animationactivities

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import binar.academy.carlauncher.R

class XmlAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    val carAnimatorSet = AnimatorInflater.loadAnimator(this, R.animator.jump_and_blink) as AnimatorSet
    carAnimatorSet.setTarget(car)

    val logoAnimatorSet = AnimatorInflater.loadAnimator(this, R.animator.jump_and_blink) as AnimatorSet
    logoAnimatorSet.setTarget(logo)

    val bothAnimatorSet = AnimatorSet()
    bothAnimatorSet.playTogether(carAnimatorSet, logoAnimatorSet)

    bothAnimatorSet.duration = DEFAULT_ANIMATION_DURATION
    bothAnimatorSet.start()
  }
}
