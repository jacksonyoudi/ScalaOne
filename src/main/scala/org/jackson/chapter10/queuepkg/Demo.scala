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

    // 获取第一个元素，对队列无影响
    println(ints.head)
    println(ints.last)

    // tail 取出队尾的数据， 返回除了第一个以外剩余的元素
    println(ints.tail.tail)
    println(ints.front)

    println(ints)
  }
}
