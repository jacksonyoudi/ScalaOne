package org.jackson.chapter09.implicitpkg


/**
 * 隐式函数 是以implicit关键字声明的带有单个参数的函数
 * 这种函数将会自动转化应用，将值从一种类型转换为另一种类型
 *
 *
 * 隐式函数的函数名可以是任意的，隐式转换与函数名称无关，只与函数签名(参数和返回值)有关
 * 隐式函数可以有多个(隐式函数列表)，但是需要保证在当前环境下，只有一个隐式函数能被识别
 */
object Demo {
  def main(args: Array[String]): Unit = {
    // 编写一个隐式函数 double => int
    implicit def f1(double: Double): Int = { // 底层生成 f1$1
      double.toInt
    }

    val num: Int = 3.5 // 底层编译 f1$1(3.5)
    println(num)
  }
}





