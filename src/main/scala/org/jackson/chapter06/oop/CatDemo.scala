package org.jackson.chapter06.oop

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小白" //等价于 cat.name_$eq("小白")
    cat.age = 10
    cat.color = "白色"
    println("小猫的信息")
    println(cat.toString)
  }
}

/**
 * 一个class cat对应的字节码文件只有一个Cat.class 默认是public
 *
 * 1. 声明一个var name:string，在底层对应private name
 * 2. 同时会生成两个public方法 name() 《==》getter public name_$eq => setter
 */
class Cat {
  var name: String = "" // 必须有初始值
  var age: Int = _ // 默认值，表示对应类型的零值
  var color: String = _ // 也是 ""


  override def toString: String = {
    return this.color + this.age + this.name
  }
}