package org.jackson.chapter14.partialfuncpkg


/**
 * 偏函数的简化版
 */
object Demo03 {
  def main(args: Array[String]): Unit = {

    // isDefinedAt apply 简化如下
    def f1: PartialFunction[Any, Int] = {
      case i: Int => i + 1
    }

    // 偏函数
    val list3 = List(1, 2, 3, 4, "hello", 1.2).collect {
      case i: Int => i + 1
      case j: Double => j.toInt * 2
    }

    println(list3)
  }
}
