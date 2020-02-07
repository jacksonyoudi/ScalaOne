package org.jackson.chapter10.queuepkg

import scala.collection.mutable

object Demo {
  def main(args: Array[String]): Unit = {
    val ints = new mutable.Queue[Int]()
    println(ints)
    // 默认加载后面
    ints += 4
    ints ++= List(1, 2)



  }
}
