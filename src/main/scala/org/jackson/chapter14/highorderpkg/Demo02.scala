package org.jackson.chapter14.highorderpkg

/**
 * 高阶函数返回 函数
 */
object Demo02 {
  def main(args: Array[String]): Unit = {
    // 高阶函数， 返回了匿名函数 闭包
    // 返回的匿名函数
    // 返回的匿名函数使用变量接收
    def minusxy(x: Int) = {
      (y: Int) => x - y
    }

    val res = minusxy(100)(9) // 函数柯里化
    println(res)
  }

}
