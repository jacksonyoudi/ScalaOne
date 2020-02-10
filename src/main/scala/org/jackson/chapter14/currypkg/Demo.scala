package org.jackson.chapter14.currypkg


/**
 * 函数柯里化
 * 1. 函数编程中，接受多个参数的函数都可以转成接受单个参数的函数，这个转换的过程叫做柯里化
 * 2. 柯里化就是证明了函数只需要一个参数而已
 * 3. 不用设立柯里化存在的意义  柯里化就是以函数为主体这种思想发展的必然产生的结果。
 *
 * 柯里化: 一个函数完成一个工作, 一个函数只接受一个参数
 */
object Demo {
  def main(args: Array[String]): Unit = {
    def multi(x: Int)(y: Int): Int = {
      x * y
    }

    println(multi(1)(2))

    def eq(s1: String, s2: String): Boolean = {
      s1.equals(s2)
    }

    // 隐式类
    implicit class Test(s: String) {
      // 转换大小写
      def checkEq(ss: String)(f: (String, String) => Boolean) = {
        // 比较
        f(s.toLowerCase, ss.toLowerCase)
      }
    }

    val m = "ss"
    m.checkEq("Ss")(eq)
    println(m.checkEq("ss")(_.equals(_)))
  }
}
