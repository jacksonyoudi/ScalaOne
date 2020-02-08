package org.jackson.chapter11.scanpkg

object Demo {
  def main(args: Array[String]): Unit = {
    def minus(a: Int, b: Int): Int = {
      a - b
    }

    /**
     * 5 （1，2，3，4，5）
     * (5, 4, 2, -1, -5, -10)
     */
    val seq = (1 to 5).scanLeft(5)(minus)
    println(seq)

    def add(a: Int, b: Int): Int = {
      a + b
    }

    // (1,2,3,4,5) => (20,19,17,14,10,5)
    val sum = (1 to 5).scanRight(5)(add)
    println(sum)

    // (1,2,3) (3,3,6,18)

  }
}

