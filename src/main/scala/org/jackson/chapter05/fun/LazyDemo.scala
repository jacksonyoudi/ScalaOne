package org.jackson.chapter05.fun


/**
 * 惰性函数
 * lazy 不能修饰 var
 * 不但函数在调用的时候会延迟，如果对变量 lazy修饰， 变量也会延迟
 *
 */
object LazyDemo {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("开始")
    println("res=" + res)
  }

  def sum(i: Int, i1: Int): Int = {
    println("sum() 执行")
    return i + i1
  }
}
