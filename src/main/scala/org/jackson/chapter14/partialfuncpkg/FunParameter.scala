package org.jackson.chapter14.partialfuncpkg

/**
 * 作为    参数的函数
 * 函数的类型， 函数参数类型和个数
 */
object FunParameter {
  def main(args: Array[String]): Unit = {
    def plus(x: Int): Int = {
      3 + x
    }

    // 说明 函数也是有类型的
    println((plus _))

    val res = List(1, 2, 3, 4).map(plus(_)) // map(plus)
    println(res.mkString(","))
  }

}
