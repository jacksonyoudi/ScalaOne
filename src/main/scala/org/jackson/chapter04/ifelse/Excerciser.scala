package org.jackson.chapter04.ifelse

import scala.io.StdIn

/**
 * 任何表达式都有返回类型
 * 没有返回值，就是unit ()
 */


object Excerciser {
  def main(args: Array[String]): Unit = {
    println("输入")
    val a = StdIn.readInt()
    if (a > 100) {
      println(100)
    } else if (a > 10) {
      println("hello")
    } else {
      println("xixix")
    }
  }
}
