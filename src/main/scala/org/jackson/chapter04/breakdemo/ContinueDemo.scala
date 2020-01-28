package org.jackson.chapter04.breakdemo

/**
 * 使用循环守卫
 * 或使用if
 */
object ContinueDemo {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10 if (i != 2 && i != 3)) {
      println(i)
    }
  }
}
