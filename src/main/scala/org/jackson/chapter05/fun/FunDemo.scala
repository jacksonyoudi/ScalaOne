package org.jackson.chapter05.fun

/**
 * 函数的调用机制
 * 1. 加载到内存中
 * 2. 栈
 *
 * 注意退出条件
 *
 * 1.函数的参数可以多个，如果没有参数，
 *
 */
object FunDemo {
  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 2
    val results = sum(1, 2)
    println(results)

  }

  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
