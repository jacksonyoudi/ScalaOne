package org.jackson.chapter07.superclass

/**
 * java中父类，会显式或隐式调用 super();
 *
 *
 * scala中，一定会调用主构造器
 * 1. scala也是先构建父类的部分
 *
 * class Student() extends Person()
 * class Student(name) extends Person(name)
 *
 * 注意，调用父类的构造器 只能在extends后面一个出口
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val a = new Student
    val b = new Student("hello")
  }
}

class Person {
  var name: String = "person"
  println("主 person")
}

class Student extends Person {
  println("主 student")

  def this(name: String) {
    this
    this.name = name
    println("从 student")
  }

}
