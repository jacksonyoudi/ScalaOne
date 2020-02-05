package org.jackson.chapter09.implicitpkg

/**
 * 隐式值
 * 当一个隐式参数没有 匹配到隐式值， 使用默认值
 */
object Demo02 {
  def main(args: Array[String]): Unit = {
    implicit val str1: String = "jackson"

    def hello(implicit name: String): Unit = {
      println(name + " hello")
    }

    hello
  }
}
