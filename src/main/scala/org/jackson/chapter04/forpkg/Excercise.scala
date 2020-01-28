package org.jackson.chapter04.forpkg


/**
 * 使用 纯函数 不引用外部变量，使用递归和迭代
 */
object Excercise {
  def main(args: Array[String]): Unit = {
    var count = 0
    var sum = 0

    /*for (i <- 1 to 100 if i % 9 == 0) {
      count += 1
      sum += i
    }
    println(count, sum)*/


    for (j <- Range(0, 100, 9)) {
      count += 1
      sum += j
    }
    println(count, sum)

    // 使用while 没有返回值，使用外部变量了
    var i = 0
    while (i < 10) {
      println("hello+" + i)
      i += 1
    }


    
  }
}
