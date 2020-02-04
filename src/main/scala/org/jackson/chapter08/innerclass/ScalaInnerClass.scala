package org.jackson.chapter08.innerclass

/**
 *
 */
object ScalaInnerClass {
  def main(args: Array[String]): Unit = {
    val soutClass = new SoutClass()
    val soutClass1 = new SoutClass()

    // 对象 内部类 的方式创建 这里语法可以看出scala中，默认情况下内部类实例
    // 和外部对象关联
    val sInnerClass = new soutClass.SInnerClass()
    val sInnerClass1 = new soutClass1.SInnerClass()


    // 创建静态类
    val staticInnerClass = new OuterClass.StaticInnerClass()
  }
}

// 内部类
class SoutClass {

  class SInnerClass {

  }

}


// 内部静态类
object SoutClass {

  class SstaticInnerClass {

  }

}
