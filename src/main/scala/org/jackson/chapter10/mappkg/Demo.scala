package org.jackson.chapter10.mappkg

import scala.collection.mutable

/**
 * scala中不可变map类型，构建map中的元素底层是Tuple2类型。
 * 输出顺序和声明顺序一致
 * 构建map集合中，集合中的元素其实是tuple2类型的
 * 默认情况下使用map是不可变
 *
 *
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

    var a = (1, 2, 3)
    println(a.getClass)
    val b = new Tuple2(1, 2)
    println(b.getClass)


    /**
     * 如果我们 确定map有这个key，则应当使用map(key),速度快
     * 不确定是否有key,可以先使用  contains进行判断
     * 如果只是简单的希望得到一个值，是否
     */
    // 如果没有 就报错
    println(map4("one"))

    // contains
    if (map4.contains("one")) {
      println(map4("one"))
    } else {
      println("key not exits")
    }

    // get
    println(map4.get("one").get) // some
    println(map4.get("one~"))

    // getOrElse()
    println(map4.getOrElse("one0", "null"))


    // 注意 不可变map不能修改,存在更新 不存在就添加
    map4("three") = 3
    println(map4)

    // -> 或 对偶 元祖的方式 会更新操作
    map4 += (("4", 100))
    map4 += ("4" -> 100, "6" -> 500)


    // 删除
    map4 -= ("one", "two")
    println(map4)



  }
}
