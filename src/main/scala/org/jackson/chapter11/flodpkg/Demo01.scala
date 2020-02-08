package org.jackson.chapter11.flodpkg

import scala.collection.mutable.ArrayBuffer

object Demo01 {
  def main(args: Array[String]): Unit = {
    val s = "AAAAAAAAAAAABBBBBCCCCCCCDDDDD"
    val buffer = new ArrayBuffer[Char]()

    // 理解折叠第一个参数的的作用
    s.foldLeft(buffer)(putArr)
    println(buffer)


  }

  def putArr(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    // 将 c 放入arr
    arr.append(c)
    arr
  }
}
