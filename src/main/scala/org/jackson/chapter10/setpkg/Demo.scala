package org.jackson.chapter10.setpkg

import scala.collection.mutable

/**
 * set就是hashset 数据就一个
 *
 * scala中默认set是不可变的
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val set = Set("one", "one", 1, 3)
    println(set)
    val set1 = mutable.Set("one", "two", 1, 2, 3, 4)
    println(set1)
    set1.+=(1)
    set1 += (1, 2, 3, 4)
    set1.remove(1)
    set1 -= 2
    for (elem <- set1) {
      println(elem)
    }

//    set1.max
//    set1.min
  }
}
