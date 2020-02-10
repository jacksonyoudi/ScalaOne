package org.jackson.chapter13.caseclasspkg

/**
 * 样例类 case 模板类
 *
 * 1. 样例类仍然是类
 * 2. 样例类是用case关键字进行声明的
 * 3. 样例类是为了模式匹配而优化的类
 * 4. 构造器中每一个参数都成为val -- 除非它被显式地声明为var (不建议)
 * 5.在样例类对应的伴生对象中提供apply方法让你不用new关键字就能构建出相应的对象
 * 6. 提供unapply方法让模式匹配可以工作
 * 7. 将自动生成tostring, equals, hashcode和copy方法(有点像模板类，直接给生成，供程序员使用)
 * 8. 除了上述以外，构建类和其他类完全一样，你可以添加方法和字段，扩展它们。
 */
object Demo {
  def main(args: Array[String]): Unit = {
    // 样例类， 自动实现unapply
    // 使用样例类的方式进行对象匹配 简洁性
    for (elem <- Array(Dollar(100), Currency(10000, "RMB"), NoAmount, "$")) {
      val result = elem match {
        case Dollar(v) => "$" + v
        case Currency(v, u) => v + " " + u
        case NoAmount => "NoAmout"
        case _ => "No"
      }

      println(result)
    }
  }
}

abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount
