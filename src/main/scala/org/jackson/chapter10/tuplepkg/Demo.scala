package org.jackson.chapter10.tuplepkg

/**
 * 容器
 * 灵活，将多个无关的数据封装为一个整体 对数据没有过多的约束
 *
 * 注意： 元祖中最大只能有22个元素
 *
 * 元祖数据的遍历
 *
 * tuple是一个整体， 遍历需要调用其迭代器
 *
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    // 说明 1. tuple1 就是一个tuple 类型就是tuple4
    // 简单说明： 为了高效的操作元祖，编译器根据元素的个数不同，对应不同的元祖类型
    // 分别 Tuple1---> Tuple22
    val tuple1 = (1, 2, 3, 4, "hello", 4)
    println(tuple1)

    //元素访问

    println(tuple1._1) // 第一个元素
    println(tuple1.productElement(0))


    // 遍历元祖,要使用迭代器
    for (elem <- tuple1.productIterator) {
      println("item->", elem)
    }
  }
}
