package org.jackson.chapter08.innerclass

/**
 *
 */
object ScalaInnerClass {
  def main(args: Array[String]): Unit = {
    val soutClass = new SoutClassOne()
    val soutClass1 = new SoutClassOne()


    // 对象 内部类 的方式创建 这里语法可以看出scala中，默认情况下内部类实例
    // 和外部对象关联
    val sInnerClass = new soutClass.SInnerClass()
    sInnerClass.info()
    val sInnerClass1 = new soutClass1.SInnerClass()

    // 默认情况下， scala的内部类的实例和创建该内部类实例的外部对象关联
    sInnerClass.test(sInnerClass)
    sInnerClass.test(sInnerClass1)


    // 创建静态类
    val staticInnerClass = new OuterClass.StaticInnerClass()
  }
}

// 内部类名.this.属性
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


// 使用别名
class SoutClassOne {
  myouter => // 这里可以理解，外部类的别名 看做是外部类的一个实例

  /**
   * 访问方式: 外部类名.this.属性名
   * 内部类当成外部类的一个实例
   */
  class SInnerClass {
    def info(): Unit = {
      println("name=" + myouter.name + " sal=" + myouter.sal)
    }

    // 类型投影
    // 类型投影的作用就是屏蔽 外部对象对内部类对象的影响
    def test(in: SoutClassOne#SInnerClass): Unit = {
      println(in)
    }
  }

  // 定义属性
  var name = "jack"
  private var sal = 3000

}


// 内部静态类
object SoutClass {

  class SstaticInnerClass {

  }

}
