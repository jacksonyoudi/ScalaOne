package org.jackson.chapter06.constructor


/**
 * 可以多个构造器，可以重载 主构造器 1个，辅构造器 多个
 * 通过参数进行区分
 * class name(形参列表) {}
 *
 * def this(args) {}
 * def this(args) {}
 *
 *
 * 主构造器就是将类中，除去method以外的代码全部包装到一个java的构造器中，所以会执行
 *
 * 如果没有参数，可以省略()
 *
 * 辅助构造器要求第一句是调用主构造器
 *
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val p = new Person("xiix", 12)
    println(p)
  }
}

class Person(InName: String) {
  println("one")
  var name: String = InName
  var age: Int = _

  def this(name: String, age: Int) {
    this(name)
    println("two")
    this.age = age
  }

  override def toString: String = {
    "name=" + name + "\nage=" + age
  }
}
