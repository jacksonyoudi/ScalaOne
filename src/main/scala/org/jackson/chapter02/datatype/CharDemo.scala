package org.jackson.chapter02.datatype

/**
 * unicode包含了ascii码
 * 1. 当把一个计算的结果赋值一个变量，则编译器会进行类型转换以及判断(看范围+类型)
 * 2. 当把一个字面量的赋值给一个变量，编译器只进行范围的判断
 * 3.
 */
object CharDemo {
  def main(args: Array[String]): Unit = {
    var char1: Char = 97
    print("char=" + char1)

    // char也可以用于数值运算
    var char2: Char = 'a'
    var num = 100 + char2
    print("num=" + num)
  }
}
