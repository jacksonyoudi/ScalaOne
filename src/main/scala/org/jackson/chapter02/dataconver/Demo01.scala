package org.jackson.chapter02.dataconver


/**
 * 1. 强制转换  大 ->小
 * 2. 注意优先级，使用() 进行优先级，只对最近有效
 * 3. char可以保存常量值，不能使用变量赋值
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    var n1 = 10
    var n2 = 1.1f
    var n3 = n1 + n2

    val n4 = n3.toInt


  }
}
