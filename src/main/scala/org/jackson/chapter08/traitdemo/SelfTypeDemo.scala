package org.jackson.chapter08.traitdemo

object SelfTypeDemo {
  def main(args: Array[String]): Unit = {

  }
}

/**
 * java类成员
 * 1. 属性
 * 2. 方法
 * 3. 内部类
 * 4. 构造器
 * 5. 代码块
 *
 *
 * Logger 就是自身类型特质，当这里做了自身类型后，那么
 * 防止嵌套使用
 */
trait Logger {
  // 明确告诉编辑器 我就是exception,如果没有这句话，下
  // 面 getMessage不能调用
  this: Exception =>
  {
    def log(): Unit = {
      println(getMessage)
    }
  }
}

//class ConsoleOne extends Logger {
//
//}

class Console extends Exception with Logger {

}
