package com.base

/**
  * object表示单例模式，def main为scala强制主入口，类似java的main
  *
  * @author zwang
  * @version V1.0
  * @since 2018-01-10 15:03
  */
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!") // 输出 Hello World

    var myVar : String = "foo"
    myVar = "dd"
    println(myVar)

    val myVal : String = "fff"

    // val定义常量后不能修改
    //    myVal = "fff"
  }
}
