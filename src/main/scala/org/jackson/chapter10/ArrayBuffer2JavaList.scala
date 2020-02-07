package org.jackson.chapter10

import scala.collection.mutable.ArrayBuffer

object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {
    val ints = ArrayBuffer("1", "2", "3")

    import scala.collection.JavaConversions.bufferAsJavaList

    val builder = new ProcessBuilder(ints)
    // 返回java类型
    val strings = builder.command()
    println(strings)

    // java list转 scala arrayBuffer
    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable

    val scalaArr: mutable.Buffer[String] = strings
    scalaArr.append("jack")
    println(scalaArr)
  }
}

