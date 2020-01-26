package org.jackson.chapter02.datatype

object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    var num = 1.2
    var num2 = 1.7f
    num2 = num.toFloat

    print(sayHello)

  }

  // 在开发中，有一个方法，就会异常中断，这是就可以返回Nothing
  // 通过对返回值进行判断，
  def sayHello: Nothing = {
    throw new Exception("抛出异常")
  }
}