package org.jackson.chapter13.caseclasspkg

/**
 * 默认和copy对象属性一致， 属性也可以修改
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    val cat = Cat(3)

    val cat1 = cat.copy(4)

    println(cat.hashCode())
    println(cat1.hashCode())
  }
}


case class Cat(age: Int)