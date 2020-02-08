package org.jackson.chapter11.reducepkg


/**
 * reduce: 二元函数 叠加计算
 * 化简
 *
 * 1,2,3,4,5
 *
 * right
 * 1- (2-(3-(4-5)))
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5, 6, 7, 8)
    val i = list1.reduceLeft((a: Int, b: Int) => {
      a + b
    })

    val i1 = list1.reduce((a: Int, b: Int) => {
      a - b
    })

    println(i1)
    val i2 = list1.reduceLeft((a: Int, b: Int) => {
      a - b
    })
    println(i2)
    val i3 = list1.reduceRight((a: Int, b: Int) => {
      a - b
    })
    println(i3)


    val list2 = List(4, 2, 3, 40, 15, 60, 7, 80)
    val j = list2.reduce((a: Int, b: Int) => {
      if (a < b) a else b
    })
    println(j)

  }
}
