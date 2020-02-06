package org.jackson.chapter10

object ArrayDemo01 {
  def main(args: Array[String]): Unit = {

    // 泛型 [any]任意类型
    /**
     * 没有赋值，默认是0
     * array是不可变类型
     * 修改通过索引可以直接操作
     *
     */
    val ints = new Array[Int](4)

    println(ints.length)
    for (elem <- ints) {
      println(elem)
    }

    ints(3) = 10
    for (elem <- ints) {
      println(elem)
    }
    /**
     * 使用 Array apply
     * 使用泛型
     */
    val array = Array(1, 2, "4")

    for (index <- 0 to array.length - 1) {
      println(array(index))
    }
  }
}



