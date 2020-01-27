package org.jackson.chapter02.dataconver


/**
 * 1. 值类型和字符串的转化
 * 2. 字符串小数转成整数需要注意
 */
object String2Basic {
  def main(args: Array[String]): Unit = {
    val s: String = "12"
    s.toInt
  }
}
