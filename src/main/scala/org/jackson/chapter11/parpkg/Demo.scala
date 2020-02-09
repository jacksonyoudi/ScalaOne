package org.jackson.chapter11.parpkg

/**
 * 并行计算 par
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    (1 to 5).foreach(println(_))
    // 结果无序， 分配给不同的cpu
    (1 to 5).par.foreach(println(_))


    val rs1 = (0 to 100).map { case _ => Thread.currentThread().getName }.distinct
    val rs2 = (0 to 100).par.map { case _ => Thread.currentThread().getName }.distinct
    println(rs1)
    println("---------------")
    println(rs2.length)
  }
}
