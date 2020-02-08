package org.jackson.chapter11.flodpkg

/**
 * 折叠的缩写
 * flodLeft /:
 * flodright :\
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4)

    /**
     * 折叠的理解和化简的运行机制几乎一样
     * 步骤1 list.foldLeft(5)(minus) 理解成 List(5, 1, 2, 3, 4) 再 list.reduceLeft(minus)
     * (((5-1) - 2) -3) -4 = -5
     *
     * list.foldRight(5)(minus) 理解成 List(1, 2, 3, 4, 5) 再 list.reduceRight(minus)
     *
     * 1-(2- (3-(4-5)))
     */

    println(list1.foldLeft(5)(minus)) // 函数柯里化
    println(list1.foldRight(5)(minus))

    // 简写
    (1 /: list1) (minus)
    (list1 :\ 10) (minus)
  }


  def minus(a: Int, b: Int): Int = {
    a - b
  }
}
