package org.jackson.chapter06.constructor


/**
 * 主构造器是为了进行与父类关联
 * 辅助构造器无论直接或间接，最终必须一定要调主构造器,执行主构造器的逻辑
 *
 *
 * 如果想让主构造器变成私有的，可以在()之前加上private
 *
 *
 */
object Demo02 {
  def main(args: Array[String]): Unit = {
    val a = new A("hello")
  }
}

class B {
  println("B")
}

class A extends B {
  def this(name: String) {
    this
    println("A this(name:String)")
  }
}
