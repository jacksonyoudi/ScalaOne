package org.jackson.chapter10.listpkg

object Demo {
  def main(args: Array[String]): Unit = {

    // scala.collection.immutable.List 不可变对象
    // list是不可变， 可变是使用ListBuffer
    // List在package object scala做了 val List = scala.collection.immutable.List

    val value = List(1, 2, 3)
    println(value)
    // 空集合 val Nil = scala.collection.immutable.Nil
    val list02 = Nil
    println(list02)

  }
}


