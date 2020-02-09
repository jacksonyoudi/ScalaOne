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
     * => 可以多行 不需要 break,从上往下，自动退出
     * 都没匹配成功， _
     *
     * 如果 没有 _, 都没匹配成功，就会抛出异常
     * 不用break，自动中断
     * 可以在macth中进行很多类型匹配，类型比较疏松
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
      case 1 => println("one")
      case _ => {
        println("oper err")
      }
    }
    println(res)
  }
}
