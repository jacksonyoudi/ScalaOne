package org.jackson.chapter07.visit

object Demo {
  def main(args: Array[String]): Unit = {
    val c = new Clerk
    c.ShowInfo()
  }
}

/** 当出现了class 和object name的
 * object 伴生对象
 * class 伴生类
 * scala中没有static，伴生类 写非静态内容， 伴生对象就是静态内容
 * private可以在本类、伴生类中访问，在外部不可以使用
 *
 *
 * 1. 默认 是 编译private , 方法是public
 * 2. 使用private 修饰后，编译后，方法只有只读的权限， 外类不可访问。
 * 3. protect，外包不可以访问
 * 4. private[visit] val name = "jack" 包下面也可以访问， 扩大了访问权限
 * 5. public不能显式使用
 */
class Clerk { //伴生类
  var name: String = _
  private var sal: Double = 999.0 //只有只读的方法

  def ShowInfo(): Unit = {
    println("name:" + name + "sal:" + sal)
  }
}

object Clerk { //伴生对象
  def test(c: Clerk): Unit = {
    println("test() name=" + c.name + "sal:" + c.sal)
  }

}
