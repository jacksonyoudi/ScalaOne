package org.jackson.chapter08.traitpkg

object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    val sheep = new Sheep
    sheep.sayHello
    sheep.sayHi
  }
}


trait Trait03 {
  def sayHi()

  def sayHello(): Unit = {
    println("say Hello~~~~")
  }
}

class Sheep extends Trait03 {
  override def sayHi(): Unit = {
    println("sheep say hi")
  }

  //  override def sayHello(): Unit = {
  //    super.sayHello()
  //  }
}

