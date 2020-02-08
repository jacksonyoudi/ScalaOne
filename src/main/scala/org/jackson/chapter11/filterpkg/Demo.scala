package org.jackson.chapter11.filterpkg

/**
 * filter() 函数中是一个 布尔类型的
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val list01 = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val list02 = list01.filter((n: Int) => {
      if (n % 2 == 0) true else false
    })
    println(list02)
  }
}
