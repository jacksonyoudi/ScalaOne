package org.jackson.chapter04.forpkg

/**
 * 返回vector
 * scala语法特点，将一个集合进行函数处理 在 管道再函数处理
 */
object YieldFor {
  def main(args: Array[String]): Unit = {
    val res = for (i <- 1 to 10) yield i
    println(res)


    for (i <- Range(1, 10, 2)) {
      println(i)
    }

    // 循环守卫 实现break
    for (i <- 1 to 10 if i % 2 == 1) {
      println(i)
    }
  }


}
