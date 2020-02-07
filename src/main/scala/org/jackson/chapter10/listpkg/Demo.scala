package org.jackson.chapter10.listpkg

object Demo {
  def main(args: Array[String]): Unit = {

    // scala.collection.immutable.List 不可变对象
    // list是不可变， 可变是使用ListBuffer
    // List在package object scala做了 val List = scala.collection.immutable.List

    val value = List(1, 2, 3, "111")
    println(value)
    // 空集合 val Nil = scala.collection.immutable.Nil
    val list02 = Nil
    println(list02)

    // 访问list元素
    println(value(1))


    // 元素追加， 会返回一个新的列表
    // 注意 :+ +: 符号重载
    val v1 = value :+ 3
    println(v1)

    val v2 = 4 +: value
    println(v2)

    // :: 使用 从右向左
    /**
     * 说明
     * 1. Nil list()
     * 2. v2 放进去
     * 3. 6放进去
     * 4. 5 放进去
     *
     */
    val list5 = 4 :: 5 :: 6 :: v2 :: Nil
    println(list5)

    /**
     * :::  进行扁平化后操作
     *
     */

    val list6 = 4 :: 5 :: 6 :: v2 ::: 7 :: Nil
    println(list6)
  }
}


