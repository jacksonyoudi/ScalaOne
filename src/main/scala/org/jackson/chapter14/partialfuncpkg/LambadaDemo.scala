package org.jackson.chapter14.partialfuncpkg

/**
 * 没有名字的匿名函数，可以通过函数表达式来设置匿名函数
 *
 * 1. 匿名函数的返回类型是通过类型推导实现的
 * (par:Type) => {}
 *
 *
 * 1. 不需要写def 函数名
 * 2. 不需要写返回类型，使用类型推导
 * 3. = 变成 =>
 * 4. 如果有多行可以使用 {}
 */
object LambadaDemo {
  def main(args: Array[String]): Unit = {
    val tr = (x: Double) => 3 * x
    println(tr(3.0))
  }
}
