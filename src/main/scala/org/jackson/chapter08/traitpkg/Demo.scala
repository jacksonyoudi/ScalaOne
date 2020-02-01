package org.jackson.chapter08.traitpkg


/**
 * trait (interface + abstract) mix
 * java的接口都可以当成trait使用
 *
 * 语法：
 * trait name { body }
 *
 * 没有父类
 * class name extends trait1 with 2 with 3
 *
 * 有父类
 * class name extends 父类 with 1 with 2
 *
 *
 * 1. 特质 可以同时拥有抽象方法和具体方法，一个类可以实现和继承多个特质
 * 2.
 */
object Demo {
  def main(args: Array[String]): Unit = {

  }
}

object T1 extends Serializable {

}

object T2 extends Cloneable {

}
