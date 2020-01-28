package org.jackson.chapter04.`for`

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 10
    for (i <- start to end) {
      println("num" + i)
    }
  }
}
