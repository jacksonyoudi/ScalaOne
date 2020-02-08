package org.jackson.chapter11.flodpkg

object Demo02 {
  def main(args: Array[String]): Unit = {
    val s = "AAAAAAAAAAAABBBBBCCCCCCCDDDDD"
    val map2 = s.foldLeft(Map[Char, Int]())(charCount)
    println(map2)

  }

  def charCount(map: Map[Char, Int], char: Char): Map[Char, Int] = {
    map + (char -> (map.getOrElse(char, 0) + 1))
  }


  // 使用可变map

}
