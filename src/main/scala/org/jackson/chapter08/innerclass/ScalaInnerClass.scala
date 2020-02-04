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
    sInnerClass.info()
    val sInnerClass1 = new soutClass1.SInnerClass()


    // 创建静态类
    val staticInnerClass = new OuterClass.StaticInnerClass()
  }
}

// 内部类
class SoutClass {
  // 定义属性
  var name = "hello"
  private var sal = 3000

  /**
   * 访问方式: 外部类名.this.属性名
   * 内部类当成外部类的一个实例
   */
  class SInnerClass {
    def info(): Unit = {
      println("name=" + SoutClass.this.name + " sal=" + SoutClass.this.sal)
    }
  }

}


// 内部静态类
object SoutClass {

  class SstaticInnerClass {

  }

}
