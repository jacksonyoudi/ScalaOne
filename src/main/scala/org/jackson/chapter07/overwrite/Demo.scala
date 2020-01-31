package org.jackson.chapter07.overwrite


/**
 * java
 * 只能overwrite method，属性不能覆写属性
 * java通过隐藏父类相同的属性
 *
 *
 * 字段的覆写： 其实是age() 方法的覆写
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val a: A = new B // 动态绑定， 内存地址
    val b: B = new B
    println("a:", a.age, "b:", b.age)
  }
}

class A {
  val age: Int = 10
}

class B extends A {
  override val age: Int = 20
}
