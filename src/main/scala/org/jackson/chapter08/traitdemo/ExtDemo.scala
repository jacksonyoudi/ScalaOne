package org.jackson.chapter08.traitdemo

object ExtDemo {
  def main(args: Array[String]): Unit = {

  }
}


/**
 * 所有混入该特质的类，会自动成为那个特质所继承的超类的子类
 *
 * 注意 会有多继承的问题
 *
 *  1. LoggerException 继承了Exception
 *  2. LoggedException 特质就可以 拥有了 Exception 功能
 */
trait LoggedException extends Exception {
  def log(): Unit = {
    println(getMessage()) // 方法来自exception
  }
}

class Happy extends LoggedException {
  override def log(): Unit = {

  }
}