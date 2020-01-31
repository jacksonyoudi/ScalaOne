package org.jackson.chapter07.overwrite


/**
 * java
 * 只能overwrite method，属性不能覆写属性
 * java通过隐藏父类相同的属性
 *
 *
 * 字段的覆写： 其实是age() 方法的覆写
 *
 * 注意细节：
 *  1. def 只能重写另一个def(即：方法只能重写另一个方法)
 *  2. val只能重写另一个val属性，或 重写不带参数的def
 *  3. 当一个类含有抽象属性，则该类需要标记为abstract
 *  4. 对于抽象的属性，在底层不会生成对应的属性申明，而是生成两个对应的抽象方法(name, name_$eq)
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val a: A = new B // 动态绑定， 内存地址
    val b: B = new B
    println("a:", a.age, "b:", b.age)
  }
}

class A {
  val age: Int = 10
}

class B extends A {
  override val age: Int = 20
}

abstract class AA {
  var name: String
}


class BB extends AA {
  // 1. 如果我们在子类中去重写父类的抽象属性，本质是实现了抽象方法
  // 2. 因此这里我们可以写overwrite,也可以不写
  var name: String = ""
}