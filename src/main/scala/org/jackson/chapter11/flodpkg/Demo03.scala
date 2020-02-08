package org.jackson.chapter11.flodpkg

import scala.collection.mutable

object Demo03 {
  def main(args: Array[String]): Unit = {
    val lines = List[String]("one two thre", "heloo aa", "xxxx", "one")
    val map1 = mutable.Map[String, Int]()

    lines.foldLeft(map1)(wordCount)
    println(map1)

    def wordCount(map: mutable.Map[String, Int], line: String): mutable.Map[String, Int] = {
      val worlds = line.split(" ")
      for (elem <- worlds) {
        map += (elem -> (map.getOrElse(elem, 0) + 1))
      }
      map
    }
  }
}
