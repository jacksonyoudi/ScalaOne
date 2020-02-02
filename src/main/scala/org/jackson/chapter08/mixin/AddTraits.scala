package org.jackson.chapter08.mixin

/**
 * 如果同时 混入多个特质，称之为 叠加特质
 * 构建顺序
 * 执行方法顺序
 *
 * 指定 调用具体的超类
 * super[Data].insert(10) 只能是直接父特质 才行
 */
object AddTraits {
  def main(args: Array[String]): Unit = {
    val sql = new MySql with DB with File
    // 1. 动态混入，创建混入对象时， 顺序, 重复 就不继承了
    // Operate data  db File
    // scala叠加特质的时候，会首先从后面的特质开始执行(即从左到右)

    // 执行混入对象方法的时候，顺序又是什么？
    sql.insert(1)
    // 顺序是 1. 从右到左开始执行，  2. 当执行到super时，是指的左边的特质
    // 3. 如果左边没有特质，则super就是父特质
    //
    // 向文件 向数据库  插入数据

    val my = new MySql with File with DB
    // Operate  data  File db

    // 向数据库 向文件 插入数据
    my.insert(10)

  }
}

trait Operate4 {
  println("Operate")

  def insert(id: Int)
}


trait Data extends Operate4 {
  println("data")

  override def insert(id: Int): Unit = {
    println("插入数据:", id)
  }
}


trait DB extends Data {
  println("db")

  override def insert(id: Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}

trait File extends Data {
  println("File")

  override def insert(id: Int): Unit = {
    println("向文件")
    super.insert(id) // 这里的super 在动态混入，和顺序有关
  }
}

class MySql {

}