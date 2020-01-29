package org.jackson.chapter06.attrs

import scala.beans.BeanProperty


/**
 * 主构造器的参数未使用任何修饰符修饰，那么这个参数就是局部变量
 * 访问器
 * BeanProperty
 * beanGetter
 * beanSetter
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("he")
    val stu = new Stu
    stu.setName("hello")
    println(stu.getName)
  }
}

/**
 * 没有修饰参数，inName就是一个局部变量，用完就扔
 *
 * @param inName
 */
class Worker(inName: String) {
  var name = inName
}


/**
 * 私有只读属性，变成一个属性
 *
 * @param inName
 */
class Worker2(val inName: String) {
  var name = inName
}


/**
 * 私有可读写属性，变成一个属性
 *
 * @param inName
 */
class Worker3(var inName: String) {
  var name = inName
}


class Stu {
  @BeanProperty var name: String = _

}