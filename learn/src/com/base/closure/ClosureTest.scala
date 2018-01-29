package com.base.closure

/**
  * 闭包测试
  *
  * @author zwang
  * @version V1.0
  * @since 2018-01-11 10:33
  */
object ClosureTest {

  var factor = 3;
  val multiplier = (i: Int) => i * factor

  def main(args: Array[String]): Unit = {
    println("muliplier(1) value = " + multiplier(1))
    println("muliplier(2) value = " + multiplier(2))
  }
}
