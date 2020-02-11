package org.jackson.chapter14.abstractcontrol

object Demo02 {
  def main(args: Array[String]): Unit = {

    var x = 10
    until(x > 0) {
      x -= 1
      println("until=" + x)
    }

    // 柯里化 + 抽象控制
    def until(f: => Boolean)(block: => Unit): Unit = {
      if (f) {
        block
        // 递归调用
        until(f)(block)
      }
    }
  }
}
