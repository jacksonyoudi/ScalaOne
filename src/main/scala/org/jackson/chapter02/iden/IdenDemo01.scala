package org.jackson.chapter02.iden


/**
 * 1. 首字符是操作符，后面必须跟操作符 $plug$
 * 2. 关键字也可以使用命名
 * 3. Int不是关键字，而是预定义标识符，可以使用
 * 4. _  不可以使用， 有很多其他的含义
 */
object IdenDemo01 {
  def main(args: Array[String]): Unit = {
    val ++ = "hello world"
    println(++)

    val `true` = "one"
    println(`true`)
  }
}
