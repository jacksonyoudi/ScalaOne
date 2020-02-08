package org.jackson.chapter11.highfunc


/**
 * 传参数， 使用回调地址， 使用函数当参数使用
 *
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    test(sum _, 3)
    // 把一个函数赋值给一个变量
    val f1 = myprint _ // 下划线表示不执行
  }

  // test就是高阶函数，
  // f: Double => Double, n1: Double 函数声明，接收一个double，返回一个double
  //  n1, double是普通参数
  // f(n1) 在test函数中执行你传入的函数
  def test(f: (Double) => (Double), n1: Double): Unit = {
    println(f(n1))
  }

  def sum(d: Double): Double = {
    2 * d
  }

  def myprint(): Unit = {
    println("hello,world!!!")
  }
}

