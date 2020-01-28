package org.jackson.chapter05


/**
 * 函数是一等公民 函数也是对象
 *
 * 学习一个技术或者知识的流程
 * 需求
 *    1. 工作，技术难点
 *    2. 换工作，技术潮流
 * 解决思路：
 *    1. 尝试使用传统方法来解决
 *    2. 能够解决，但是不够完美
 *    3. 真的解决不了
 *
 * 基本语法和基本运行原理
 *
 * 快速入门案例(hello world)
 *
 * 1.该技术使用细节
 * 2. 该技术的使用陷阱 (螺旋上升) 编程水平
 */
object Method2Function {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    println(dog.sum(1, 2))

    // method -> function
    val f1 = dog.sum _
    println("f1=" + f1)
    println("call f1" + f1(10, 20))

    //
    val f2 = (n1: Int, n2: Int) => {
      n1 + n2
    }

    println("f2=" + f2)
    println("call f2:" + f2(10, 20))
  }
}

class Dog {
  def sum(n1: Int, n2: Int): Unit = {
    n1 + n2
  }
}
