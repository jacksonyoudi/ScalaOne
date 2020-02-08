package org.jackson.chapter11.flatmappkg

/**
 * flatmap就是
 * flat压扁，压平 扁平化映射
 *
 * 将集合中每个元素的子元素映射到某个函数并返回新的集合。
 */

object Demo {
  def main(args: Array[String]): Unit = {
    val ls1 = List("aa", "bb", "cc")

    val strings = ls1.flatMap((s: String) => {
      s.toUpperCase
    })
    println(strings)
  }
}

