package org.jackson.chapter12.matchpkg

object ListDemo {
  def main(args: Array[String]): Unit = {
    val list = Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))
    for (elem <- list) {
      val result = elem match {
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + " " + y
        case 0 :: tail => "0...."
        case _ => "no"
      }
      println(result)
    }

  }
}
