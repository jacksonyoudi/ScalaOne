package org.jackson.chapter10.queuepkg

import scala.collection.mutable

object Demo {
  def main(args: Array[String]): Unit = {
    val ints = new mutable.Queue[Int]()
    println(ints)
    // 默认加载后面
    ints += 4
    ints ++= List(1, 2)

    println(ints)

    // 入队列 ，队尾
    ints.enqueue(7)

    // 出队列
    println(ints.dequeue())

    println(ints)
  }
}
