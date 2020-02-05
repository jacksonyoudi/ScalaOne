package org.jackson.chapter09.implicitpkg

/**
 * 隐式类 必须包含在一定作用域内
 * 同一作用域中，不能
 *
 * 1. 隐式类参数只能有一个
 * 2.
 *
 *
 * 隐式类转换时机：
 * 1. 当方法中参数类型与目标类型不一致时
 * 2. 当对象调用所在类中不存在的方法或成员时，编译器自动将对象进行隐式转换 根据类型
 */
object ImplicitClass {
  def main(args: Array[String]): Unit = {
    // 是一个隐式类 当我们在该隐式类作用域中，创建mysql1实例
    // 该隐式类就会生效，这个工作 仍然是 编译器做的
    implicit class DB1(val m: MySql1) {
      def addSuffix(): String = {
        m + " scala"
      }
    }
    // 创建一个mysql实例
    val mySql = new MySql1
    mySql.sayOk()
    println(mySql.addSuffix())
  }
}

class MySql1 {
  def sayOk(): Unit = {
    println("sayOK")
  }
}
