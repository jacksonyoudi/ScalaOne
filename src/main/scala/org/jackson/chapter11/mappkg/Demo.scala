package org.jackson.chapter11.mappkg


/**
 * 优点：
 * 直接，比较好理解
 *
 * 缺点：
 * 不够简洁，高效
 * 没有体现函数编程特色  集合 => 函数 => 集合 => 函数 => 集合
 *
 *
 * map: 将集合中每个元素通过特定功能函数映射 转换成新的结果集合 这就是所谓的将函数作为
 * 参数传递给另一个函数，这就是函数式编程的特点
 *
 * 高阶函数: 参数是函数的 函数
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    val list1 = List[Int]()
    for (elem <- list) {
      //      list1 = list1 :+ elem * 2
      println(elem)

    }
  }
}
