package com.base.function

/**
  * TODO
  *
  * @author zwang
  * @version V1.0
  * @since 2018-01-29 17:59
  */
object Function1Test extends App {
  val succ = (x: Int) => x + 1
  val anonfun1 = new Function1[Int, Int] {
    def apply(x: Int): Int = x + 1
  }
  println(succ(0) == anonfun1(0))
  assert(succ(0) == anonfun1(0))
}
