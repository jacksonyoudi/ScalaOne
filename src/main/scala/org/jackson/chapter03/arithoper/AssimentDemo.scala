package org.jackson.chapter03.arithoper

/**
 * 三目运算符 if () 2 else 4
 */
object AssimentDemo {
  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2
    println(num)
    val num1 = if (5 > 4) 3 else 6
  }
}
