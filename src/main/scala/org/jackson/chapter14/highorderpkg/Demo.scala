package org.jackson.chapter14.highorderpkg


/**
 * 高阶函数
 * 能够接收函数作为参数的函数，叫做高阶函数 (high order function） 可使应用程序更加健壮
 *
 * 1. 可以传多个函数
 * 2. 函数相互调用
 */
object Demo {
  def main(args: Array[String]): Unit = {
    def test(f: Double => Double, n: Double) = {
      f(n)
    }


  }
}
