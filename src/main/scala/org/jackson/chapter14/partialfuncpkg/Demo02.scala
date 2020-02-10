package org.jackson.chapter14.partialfuncpkg

object Demo02 {
  def main(args: Array[String]): Unit = {

    //定义一个偏函数 接收是any, 返回是 Int
    val p = new PartialFunction[Any, Int] {
      // 如果返回true，就会去调用apply方法， 构建对象实例， 如果是 false， 过滤掉
      override def isDefinedAt(x: Any): Boolean = {
        x.isInstanceOf[Int]
      }

      //
      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }

    // 使用偏函数
    val l = List(1, 2, 3, 4, "abc")

    // collect = map + filter
    val list = l.collect(p)
    println(list)

  }
}