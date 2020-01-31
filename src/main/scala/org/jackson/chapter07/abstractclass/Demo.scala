package org.jackson.chapter07.abstractclass


/**
 * 抽象类的价值： 设计
 *
 *
 * 抽象类：
 * 1. 可以没有抽象方法,也可以有实现方法，不能实例化( 动态 实例化使用匿名)
 * 2. 必须实现所有的属性和方法
 * 3. 抽象方法和抽象属性 不能使用 private， final来修饰， 这些关键字和 重写/实现 相违背
 * 4. 抽象类中可以有实现的方法
 * 5. 子类重写抽象方法不需要overwrite，写上也不会错。
 *
 *
 * 匿名子类
 *
 *
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val a: Animal = new Animal {
      override var name: String = "hello"

      override def play(): Unit = {
        println("100")
      }
    }

    a.play()
  }
}


abstract class Animal {
  var name: String
  val age: Int = 10

  def play(): Unit
}

class Cat extends Animal {
  override var name: String = _

  override def play(): Unit = {
    println("cat miao miao")
  }
}
