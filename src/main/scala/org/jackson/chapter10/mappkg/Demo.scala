package org.jackson.chapter10.mappkg

import scala.collection.mutable

/**
 * scala中不可变map类型，构建map中的元素底层是Tuple2类型。
 * 输出顺序和声明顺序一致
 * 构建map集合中，集合中的元素其实是tuple2类型的
 * 默认情况下使用map是不可变
 */
object Demo {
  def main(args: Array[String]): Unit = {
    // 不可变， 默认是有顺序的
    val map1 = Map("a" -> 10, "b" -> 20, "c" -> "hello")
    for (elem <- map1) {
      println(elem._1, elem._2)
    }

    // 可变map, 可以动态变动
    val map = mutable.Map("one" -> "hello", 1 -> 3, 4 -> 6)
    println(map)

    // 创建空 map
    val map3 = new mutable.HashMap[String, Int]
    println(map3)

    // 对偶元祖
    val map4 = mutable.Map(("one", "hello"), (1, 3), (4, 6))
    println(map4)

    val a = (1, 2, 3)
    println(a.getClass)
    val b = new Tuple2(1, 2)
    println(b.getClass)
  }
}
