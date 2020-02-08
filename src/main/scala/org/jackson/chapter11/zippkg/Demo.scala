package org.jackson.chapter11.zippkg

/**
 * 注意事项
 * 拉链
 * 对偶元祖
 * 如果数据长度不一样，就会丢失数据
 *
 * 如果要取出数据，使用
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)
    val list3 = list1.zip(list2)
    println(list3)
    var m = list3.toMap
    println(m)
  }
}
