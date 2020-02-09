package org.jackson.chapter12.matchpkg

/**
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val operar = '*'
    val n1 = 20
    val n2 = 30
    var res = 0

    /**
     *  => 可以多行 不需要 break,从上往下，自动退出
     *  都没匹配成功， _
     */
    operar match {
      case '+' => {
        res = n1 + n2
      }
      case '-' => {
        res = n1 - n2
      }
      case '*' => {
        res = n1 * n2
      }
      case '/' => {
        res = n1 / n2
      }
      case _ => {
        println("oper err")
      }
    }
    println(res)
  }
}
