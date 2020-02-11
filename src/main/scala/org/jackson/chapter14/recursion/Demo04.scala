package org.jackson.chapter14.recursion

object Demo04 {
  def main(args: Array[String]): Unit = {
    var c = "abcd"
    println(reverseStr(c))

    println(factorial(1))
  }

  def reverseStr(xs: String): String = {
    if (xs.length == 1) {
      xs
    } else {
      reverseStr(xs.tail) + xs.head
    }
  }

  def factorial(n: Int): Int = {
    if (n == 0) {
      1
    } else {
      n * factorial(n - 1)
    }
  }
}
