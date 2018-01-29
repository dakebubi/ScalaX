package com.base.function

/**
  * TODO
  *
  * @author zwang
  * @version V1.0
  * @since 2018-01-29 18:00
  */
object Function2Test extends App {
  val max = (x: Int, y: Int) => if (x < y) y else x

  val anonfun2 = new Function2[Int, Int, Int] {
    def apply(x: Int, y: Int): Int = if (x < y) y else x
  }
  println(max(0, 1) == anonfun2(0, 1))
  assert(max(0, 1) == anonfun2(0, 1))
}
