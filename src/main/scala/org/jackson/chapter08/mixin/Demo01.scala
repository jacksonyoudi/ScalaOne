package org.jackson.chapter08.mixin

/**
 * 开闭原则 对源码闭合 对功能扩展开放
 *
 *
 * scala创建对象的形式
 * 1. new
 * 2. apply
 * 3. 匿名子类
 * 4. 动态混入
 *
 *
 * 混入的方式
 * 1. 创建时候混入 匿名类的方式
 * 2. 声明类的同时 进行混入
 * 3.
 *
 *
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    // 在不修改类的定义的基础，让他们可以使用trait方法
    val b = new OracleDB with Operate
    b.insert(10)

    val b1 = new MySqlDB with Operate
    b1.insert(20)

    //new MySqlDB {} // 相当于匿名子类

    // 如果抽象类中有抽象方法,如何混入
    val sqlite = new Sqlite with Operate {
      override def say(): Unit = {
        println("say")
      }
    }

    sqlite.insert(300)
  }
}


trait Operate {
  def insert(id: Int): Unit = {
    println("插入数据", id)
  }
}

class OracleDB {

}

abstract class MySqlDB {

}

abstract class Sqlite {
  def say()
}
