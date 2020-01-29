package org.jackson.chapter06.method

object Demo {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    println(dog.cal(1, 2))
  }
}

class Dog {
  private var sal: Double = _
  var food: String = _

  def cal(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
