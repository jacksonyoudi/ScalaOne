package org.jackson.chapter05.fun

/**
 * 代码冗余
 * 不利于代码维护
 * 函数定义
 * def name ([args...]) [[: returns] =]
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    println(getResults(1, 2, '/'))
  }

  def getResults(n1: Int, n2: Int, oper: Char) = {
    if (oper == '+') {
      n1 + n2
    } else if (oper == '-') {
      n1 - n2
    } else if (oper == "*") {
      n1 * n2
    } else {
      null
    }
  }
}
