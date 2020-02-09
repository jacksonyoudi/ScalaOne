package org.jackson.chapter12.matchpkg

/**
 * 类型匹配
 *
 * 隐藏变量名
 *
 */
object MatchTypeDemo {
  def main(args: Array[String]): Unit = {
    // 根据object类型匹配
    var obj = 1

    val res = obj match {
      case a: Int => "Int"
      //      case b: String => "map"
      //      case d: BigInt => "bigint"
      case _ => "no"
    }

    println(res)
  }
}
