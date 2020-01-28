package org.jackson.chapter04.forpkg


/**
 * until to 的区别
 *
 *
 */
object Demo02 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 11
    for (i <- start until end) {
      println(i)
    }
  }
}
