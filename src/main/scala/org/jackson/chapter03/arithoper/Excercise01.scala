package org.jackson.chapter03.arithoper

object Excercise01 {
  def main(args: Array[String]): Unit = {
    /*
    1. 搞清楚需求
    2. 思路分析
    3. 代码实现
     */

    val days = 97
    println(days / 7, days % 7)


    val sh = 232.5
    val hus = 5.0 / 9 * (sh - 100)
    println(hus.formatted("%.2f"))
  }
}
