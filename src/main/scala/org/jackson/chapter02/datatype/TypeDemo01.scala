package org.jackson.chapter02.datatype

/**
 * 一切皆对象
 * 如果没有参数，可以省略()
 *
 * scala类型分两类
 * any anyval   anyRef
 * subtype
 * implicit Conversion 隐式转换
 * Nothing 底层类
 * Null
 *
 * 1. scala一切皆为对象
 * 2. anyval 和anyref
 * 3. 相对java系统，更复杂， 面向对象和函数式编程
 * 4.
 */
object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    var num1: Int = 10
    print(num1.toDouble + 100.toString)
    say
    say()
  }


  def say(): Unit = {
    print("say hello")
  }
}

