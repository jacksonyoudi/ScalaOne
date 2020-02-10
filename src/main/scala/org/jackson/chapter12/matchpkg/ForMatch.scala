package org.jackson.chapter12.matchpkg

/**
 * for循环中的模式匹配
 */
object ForMatch {
  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 1, "b" -> 0, "c" -> 3)
    for ((k, v) <- map) {
      println(k, v)
    }

    for ((k, 0) <- map) {
      println(k)
    }

    // ==
    for ((k, v) <- map if v == 0) {
      println(k, v)
    }
  }
}
