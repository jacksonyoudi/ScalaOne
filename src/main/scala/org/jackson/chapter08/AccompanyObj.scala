package org.jackson.chapter08

object AccompanyObj {
  def main(args: Array[String]): Unit = {
    val person = new ScalaPerson
    println(person.sex, ScalaPerson.age)
  }
}


/**
 * 1. 当一个文件中，有class 和 object
 * 2. class 为伴生类， 写非静态的内容， 对象的内容
 * 3. object 为伴生对象， 写静态的内容 就是 类对象
 * 4. class 生成底层 ScalaPerson.class
 * 5. object底层生成 ScalaPerson$.class
 * 6.  ScalaPerson.age ScalaPerson$.MODULE$.age()
 */
// 伴生类
class ScalaPerson {
  var sex: String = "man"
}

/**
 * 伴生对象
 */
object ScalaPerson {
  var age: Int = 10
}