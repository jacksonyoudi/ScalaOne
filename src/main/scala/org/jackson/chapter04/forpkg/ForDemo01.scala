package org.jackson.chapter04.forpkg


/**
 * 循环守卫
 * 循环控制
 * 嵌套循环
 * 循环返回值yield
 */
object ForDemo01 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 10
    for (i <- start to end) {
      println("num" + i)
    }


    // for也可以对集合操作
    val list = List("hello", "xixi", 10, 30)

    for (j <- list) {
      println(j)
    }


  }
}
