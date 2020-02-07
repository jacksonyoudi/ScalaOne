package org.jackson.chapter10

object MultiplyArrayDemo {
  def main(args: Array[String]): Unit = {
    val array = Array.ofDim[Int](3, 4)
    for (elems <- array) {
      for (elem <- elems) {
        println(elem)
      }
    }

    for (index <- 0 until array.length) {
      for (j <- 0 until array(index).length) {
        println(index, j, array(index)(j))
      }
    }
  }
}
