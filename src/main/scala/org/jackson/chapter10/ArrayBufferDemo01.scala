package org.jackson.chapter10

import scala.collection.mutable.ArrayBuffer


object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {
    val buffer = ArrayBuffer[Any](2, 4, 5)
    // 支持可变参数
    buffer.append(3, 4)
    buffer.length

    // 可以理解成 java数组的扩容
    buffer.remove(1)
    // 返回的结果才是我们要的结果
    buffer.toBuffer

  }
}

