package org.jackson.chapter08.traitpkg

object TraitDemo {
  def main(args: Array[String]): Unit = {
    val c = new C
    val f = new F
    c.play()
    f.play()
  }
}

/** *
 *
 */

trait Trait01 {
  def play()
}


class A {}

class B extends A {}

class C extends A with Trait01 {
  override def play(): Unit = {
    println("C play")
  }
}

class D {}

class E extends D {}

class F extends D with Trait01 {
  override def play(): Unit = {
    println("F play")
  }
}
