package org.jackson.chapter04.breakdemo


/**
 * 使用break()进行中断
 */

import util.control.Breaks._

object BreakDemo {
  def main(args: Array[String]): Unit = {
    var n = 1

    /*breakable是一个高阶函数, 可以接收函数的函数
     *
     *   def breakable(op: => Unit) {
    try {
      op
    } catch {
      case ex: BreakControl =>
        if (ex ne breakException) throw ex
    }
  }
  * op => 表示没有输入和返回，相当于代码块
  * try  catch捕获异常
  * 4. 当我们传入的代码块，使用 {}
  * 5. 在 do while中也可以使用break
  * 6. 使用循环守卫实现break，注意编译器不会执行后续代码，发现标记会一直不会修改
     *
     */
    breakable {
      while (n < 20) {
        n += 1
        if (n == 18) {
          // 中断
          break()
        }
      }
    }

    println("ok")
  }

}
