package org.jackson.chapter14.recursion

object Demo04 {
  def main(args: Array[String]): Unit = {
    var c = "abcd"
    println(reverseStr(c))
  }

  def reverseStr(xs: String): String = {
    if (xs.length == 1) {
      xs
    } else {
      reverseStr(xs.tail) + xs.head
    }
  }
}
