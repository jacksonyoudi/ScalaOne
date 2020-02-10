package org.jackson.chapter12.matchpkg


/**
 * 变量值
 * match可以有返回值
 */
object MatchVar {
  def main(args: Array[String]): Unit = {
    val ch = '+'
    val res = ch match {
      case '+' => "+"
      case mychar => mychar + "hello"
      case _ => println("ok")
    }

    println(res)

    // 自动推导
    var (x, y) = (3, 4)


  }
}
