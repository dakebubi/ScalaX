package com.base.function

/**
  * TODO
  *
  * @author zwang
  * @version V1.0
  * @since 2018-01-29 17:56
  */
object Function0Test extends App {
  val javaVersion = () => sys.props("java.version")

  val anonfun0 = new Function0[String] {
    def apply(): String = sys.props("java.version")
  }
  println(javaVersion() == anonfun0())
  assert(javaVersion() == anonfun0())
}
