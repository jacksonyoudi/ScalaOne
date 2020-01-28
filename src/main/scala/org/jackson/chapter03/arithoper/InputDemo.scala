package org.jackson.chapter03.arithoper

import scala.io.StdIn

/**
 *
 * import scala.io._
 * 想看包下有哪些内容
 */

object InputDemo {
  def main(args: Array[String]): Unit = {
    println("输入姓名:")
    val name = StdIn.readLine()
    println("输入age:")
    val age = StdIn.readInt()
    println(name + age)
  }
}
