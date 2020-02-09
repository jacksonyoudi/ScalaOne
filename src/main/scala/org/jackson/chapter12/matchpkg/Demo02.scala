package org.jackson.chapter12.matchpkg


/**
 * 匹配守卫
 */
object Demo02 {
  def main(args: Array[String]): Unit = {
    for (elem <- "+-31") {
      var sign = 0
      var digt = 0
      elem match {
        // case _ 放在最开始，就会都匹配成功
        case '+' => sign = 1
        case '-' => sign = -1
        // 忽略， 守卫 如果case后有条件守卫 if, 那么这是 _ 不是表示默认匹配， 表示忽略传入的
        case _ if elem.toString.equals(3) => digt = 3
        case _ => sign = 2
      }

      println(elem, sign, digt)
    }

    val score = 60
    score match {
      case _ if (score >= 0 && score < 60) => println("D")
      case _ if (score >= 60 && score < 70) => println("c")
      case _ if (score >= 70 && score < 80) => println("B")
      case _ if (score >= 80 && score < 101) => println("A")
      case _ => println("on")
    }
  }
}
