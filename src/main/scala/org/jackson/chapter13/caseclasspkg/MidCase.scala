package org.jackson.chapter13.caseclasspkg

/**
 *
 */
object MidCase {
  def main(args: Array[String]): Unit = {
    List(1, 2, 3, 4) match {
      case a :: b :: c => println(a, b, c, c.length)
    }
  }
}
