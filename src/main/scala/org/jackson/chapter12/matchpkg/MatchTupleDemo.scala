package org.jackson.chapter12.matchpkg

object MatchTupleDemo {
  def main(args: Array[String]): Unit = {
    val tup = Array((1), (1, 2, 3), (4, 5), (6, 7, 8))
    for (elem <- tup) {
      val res = elem match {
        case (1, _) => "0...."
        case (y, 0) => "...."
        case (8) => "8"
        case _ => "no"
      }
      println(res)
    }
  }
}
