package org.jackson.chapter14.parameterinfer


/**
 * map reduce都是高阶函数 因此可以直接传入一个匿名函数
 * 当遍历list时，参数类型是可以推断出来的，可以省略数据类型Int
 * 当传入的函数，只有一个参数的时候，可以省略括号，
 * 如果变量只在=> 右边出现一次，可以使用_来代替
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println(list.map((x: Int) => x + 1))
    println(list.map((x) => x + 1))
    println(list.map(x => x + 1))
    println(list.map(_ + 1))
    println(list.reduce(_ + _))

  }
}


