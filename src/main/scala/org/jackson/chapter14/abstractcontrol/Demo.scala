package org.jackson.chapter14.abstractcontrol

import scala.util.control.Breaks._


/**
 * 抽象控制函数
 * 1. 参数是函数
 * 2. 函数参数没有输入值也没有返回值
 */
object Demo {
  def main(args: Array[String]): Unit = {
    breakable {
      var i = 0
      var flag = true
      while (flag) {
        i += 1
        if (i > 10) {
          break()
        }
      }
    }

    // 传入的函数是没有输入也没有输出的
    //
    def myRun(f: => Unit) = {
      new Thread {
        override def run(): Unit = {
          f
        }
      }.start()
    }

    //  myRun(f: () => Unit)
    //    myRun {
    //      () => {
    //        println("Hello")
    //      }
    //    }
    // 可以简化
    // myRun(f: => Unit)
    myRun {
      println("he")
    }
  }
}
