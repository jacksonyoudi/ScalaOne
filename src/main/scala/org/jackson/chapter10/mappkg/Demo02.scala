package org.jackson.chapter10.mappkg

import scala.collection.mutable

object Demo02 {
  def main(args: Array[String]): Unit = {
    val map = mutable.Map("a" -> 1, "b" -> 2, "c" -> "d")
    for (elem <- map) { // tuple2
      println(elem._1, elem._2)
      println(elem.productElement(0), elem.productElement(1))
    }


    for ((k, v) <- map) {
      println(k, v)
    }

    for (elem <- map.keys) {
      println(elem)
    }

    for (elem <- map.values) {
      println(elem)
    }


  }
}