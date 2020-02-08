package org.jackson.chapter11.mappkg

/**
 * 使用匿名函数
 * 匿名函数
 * () => {} 定义
 */
object Demo03 {
  def main(args: Array[String]): Unit = {
    val ls1 = List("aa", "bb", "cc")

    val strings = ls1.flatMap((s: String) => {
      s.toUpperCase
    })
    println(strings)
  }

  def toUpper(s: String): String = {
    s.toUpperCase
  }
}
