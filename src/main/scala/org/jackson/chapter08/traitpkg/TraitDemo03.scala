package org.jackson.chapter08.traitpkg

object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    val sheep = new Sheep
    sheep.sayHello
    sheep.sayHi
  }
}


/**
 * 1. 只有 抽象方法的时候， 底层和 java一样，是 interface
 * 2. 当有抽象方法和具体方法
 *    1. 一个trait在底层对应两个 Trait03.class 接口
 *    2. 还对应 Trait03$class.class Trait03$class抽象类
 * 3.
 */

trait Trait03 {
  def sayHi()

  def sayHello(): Unit = {
    println("say Hello~~~~")
  }
}


// 当trait有接口和抽象类的时候
// class Sheep extends Trait03 底层
// class Sheep implements Trait03
// 当在sheep类中使用Trait03的实现方法，就通过 Trait03$class
class Sheep extends Trait03 {
  override def sayHi(): Unit = {
    println("sheep say hi")
  }

  //  override def sayHello(): Unit = {
  //    super.sayHello()
  //  }
}

