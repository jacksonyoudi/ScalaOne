package org.jackson.chapter14.recursion

object Demo03 {
  def main(args: Array[String]): Unit = {
    val a = List(1, 2, 3, 4, 99, 8)
    println(max(a))
  }


  def max(xs: List[Int]): Int = {
    if (xs.isEmpty) {
      throw new java.util.NoSuchElementException
    }

    if (xs.size == 1) {
      xs.head
    } else {
      // xs.tail是表示 除去第一个后面的所有
      if (xs.head > max(xs.tail)) xs.head else max(xs.tail)
    }
  }
}
