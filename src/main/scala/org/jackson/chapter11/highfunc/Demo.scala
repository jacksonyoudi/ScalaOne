package org.jackson.chapter11.highfunc

object Demo {
  def main(args: Array[String]): Unit = {
    test(sum, 3)
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
}

