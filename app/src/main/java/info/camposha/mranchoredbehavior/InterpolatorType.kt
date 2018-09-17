package info.camposha.mranchoredbehavior

import info.camposha.mranchoredbehavior.R.id

enum class InterpolatorType(val id: Int) {
  DECELERATE(id.decelerate),
  ACCELERATE(id.accelerate),
  OVERSHOOT(id.overshoot),
  LINEAR(id.linear),
  FAST_IN_SLOW_OUT(id.fast_in_slow_out),
  BOUNCE(id.bounce)
}