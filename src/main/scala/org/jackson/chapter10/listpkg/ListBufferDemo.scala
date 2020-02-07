package org.jackson.chapter10.listpkg

import scala.collection.mutable.ListBuffer

object ListBufferDemo {
  def main(args: Array[String]): Unit = {
    val value = ListBuffer[Any](1, 2, 3, 4, "hello")
    val value2 = ListBuffer[Any](4, "hello")

    println(value(4))

    for (elem <- value) {
      println(elem)
    }

    // 动态增加
    value += 4
    println(value)
    value.append(1, 2, 3, 4)
    value ++= value2 // 元素展平， 加在后面

    value.remove(1)
  }
}
