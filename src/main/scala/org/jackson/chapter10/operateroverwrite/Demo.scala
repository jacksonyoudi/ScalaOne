package org.jackson.chapter10.operateroverwrite

object Demo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat + 10
    println(cat.age)
  }
}

class Cat {
  var age = 0

  def +(n: Int): Unit = {
    this.age += n
  }
}

