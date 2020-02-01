package org.jackson.chapter08.traitdemo

object Demo {
  def main(args: Array[String]): Unit = {
    val sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello()
  }
}

trait One {
  def sayHi()

  def sayHello(): Unit = {
    println("hello")
  }
}


class Sheep extends One {
  override def sayHi(): Unit = {
    println("sheep hi")
  }

  override def sayHello(): Unit = {
    println("sheep hello")
  }
}