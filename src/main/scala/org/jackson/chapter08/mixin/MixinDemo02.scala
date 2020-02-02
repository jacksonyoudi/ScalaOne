package org.jackson.chapter08.mixin


/**
 * abstract override 的小技巧
 * 可以理解，该方法确实是重写了父特质的抽象方法，但是重写后，该方法仍然是一个抽象
 * 方法(因为 没有完全的实现，需要其他特质继承实现 通过混入顺序)
 *
 *
 * 当做富接口使用的特质
 * 富接口: 即该特质中既有抽象方法，又有非抽象方法
 *
 *
 * 特质中可以定义具体的字段，如果初始化了就是 具体的字段，如果不初始化就是抽象字段
 * 混入该特质的类就是具有了该字段，字段不是继承，而是直接加入类，成为自己的字段
 *
 * 抽象字段必须被覆写
 */
object MixinDemo02 {
  def main(args: Array[String]): Unit = {
    val sql = new Sql with DB5 with File5 {
      override var name: String = _
    }
    sql.insert(10)
  }
}


trait Operator5 {
  var name: String

  def insert(id: Int)
}


/**
 * 1. 如果在子特质中，重写/实现了一个父特质的抽象方法，但是同时调用了
 * super
 * 2. 这时 我们的方法不是完全实现的，因此需要声明abstract overriver
 * 3. 这是 super.insert(id) 调用就和动态混入有密切联系
 */

trait File5 extends Operator5 {


  abstract override def insert(id: Int): Unit = {
    println("将数据保存在文件中.....")
    super.insert(id) // 一定会报错
  }
}


trait DB5 extends Operator5 {
  override def insert(id: Int): Unit = {
    println("将数据保存在数据库中")
  }
}

class Sql {

}
