package org.jackson.chapter11.operatpkg


/**
 * 操作符
 * 1. ``
 * 2. 中置操作符
 * 3. 后置操作符
 * 4. 前置操作符
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val a = 1
    val c = a + 3
    val d = a.+(3)
    val cat = Cat()
    cat + 10
    cat.+(10)
    cat.++
    println(cat ++)
    !cat
    println(cat.age)

  }
}

class Cat {
  var age = 0

  // 操作符重载
  def +(n: Int): Unit = {
    this.age += n
  }


  def ++(): Unit = {
    this.age += 1
  }

  // 注意， 一元操作符必须有 unary_ 关键字
  def unary_!(): Unit = {
    this.age = -this.age
  }
}

object Cat {
  def apply(): Cat = new Cat()
}
