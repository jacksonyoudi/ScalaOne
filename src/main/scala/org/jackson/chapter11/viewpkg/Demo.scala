package org.jackson.chapter11.viewpkg


/**
 * stream懒加载的特性，也可以对其他集合view方法来得到类似的效果，具有如下特点：
 * 1. view方法产出一个总是被懒执行的集合
 * 2. view不会缓存数据，每次都要重新计算，比如遍历view时。
 *
 * 对集合进行计算 map, filter reduce, fold,不需要立刻得到结果，
 * 可以使用view 进行懒执行的结果
 */
object Demo {
  def main(args: Array[String]): Unit = {
    def multi(n: Int): Int = {
      n
    }

    def eq(i: Int): Boolean = {
      i.toString.equals(i.toString.reverse)
    }

    val views1 = (1 to 100)
      .map(multi)
      .filter(eq)

    println(views1)


    //  使用到才给出
    val views2 = (1 to 100)
      .view
      .map(multi)
      .filter(eq)

    println(views2) //SeqViewMF(...) 懒加载 惰性计算
    // 遍历
    for (elem <- views2) {
      println(elem)
    }
  }
}
