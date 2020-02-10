package org.jackson.chapter12.matchpkg


/**
 * 对象匹配
 * 什么算是对象匹配
 * case中对象的unapply方法 提取器 返回some集合则为匹配成功
 * 返回name集合则为匹配失败
 *
 * unapplySeq
 *
 * 当case后面对象提取器方法参数为多个，则会默认调用def unapplySeq()方法
 * 如果unapplySeq返回的是Some，获取其中的值，判断得到的sequence中的元素个数是否是3个，如果是3个，则把三个元素分别
 * 取出，赋值给对于变量
 * 其他规则不变
 */
object ObjectMatchDemo {
  def main(args: Array[String]): Unit = {
    val number: Double = 36.0
    number match {
      /**
       * 当匹配到 case Square时候
       * 调用 Square(n)的unapply(z:Double),
       * 如果对象提取器 unapply(z:double) 返回Some(6) 则表示匹配成功
       * 同时将 6 赋值给 Square(n) 赋值给 n
       */
      case Square(n) => println(n)
      case _ => println("nothing")
    }
  }
}

object Square {
  def apply(z: Double): Double = {
    z * z
  }

  // unapply 提取器
  // 接收 z: Double类型
  // 返回类型是Option[Double]

  def unapply(z: Double): Option[Double] = {
    println("unapply")
    Some(math.sqrt(z))
  }
}