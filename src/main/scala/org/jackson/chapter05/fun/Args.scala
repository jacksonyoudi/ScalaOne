package org.jackson.chapter05.fun

/**
 * 1. test(a: _*)
 * 2. 可变参数 位置参数， 名称参数 默认参数
 *
 * def f1 = "123"
 * def f1() = {
 * "123"
 * }
 *
 * process(过程)
 * 将函数返回类型是unit的函数称为过程，如果明确函数没有返回值，那么等号可以省略
 *   1. 可能是类型推断的 注意
 */
object Args {
  def main(args: Array[String]): Unit = {
    val a = Array[Int](1, 2, 3, 4)
    test(a: _*)
  }

  // 过程
  def test(args: Int*): Unit = {
    println(args)
  }
}

