package org.jackson.chapter08.mixin


/**
 * 1.是构建对象，在混入特质时，该对象还没有创建
 * 2. 实际是构建匿名子类，可以理解成在混入特质时，对象已经创建了
 *
 *
 * 调用当前类的超类构造器
 * 第一个特质的父特质构造器
 * 第一个特质构造器
 * 第二个特质的父特质构造器
 * 第二个特质构造器
 * ....
 * 当前类构造器
 */

object MixinDemo04 {
  def main(args: Array[String]): Unit = {
    val f = new F
    // Eeee A B C D F
    println(f)

    // 动态混入
    // 先创建k对象，然后在混入其他对象
    val ff2 = new K with C with D
    // E F A B C D
    println(ff2)
  }
}

trait A {
  println("A")
}


trait B extends A {
  println("B")
}


trait C extends B {
  println("C")
}

trait D extends B {
  println("D")
}

class E {
  println("Eeee")
}

class F extends E with C with D {
  println("F")
}

class K extends E {
  println("K")
}