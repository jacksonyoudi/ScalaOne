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
 *
 *
 * 1. 伴生对象使用 object, 实现"静态"内容 单例实现了一个$的类
 * 2. 伴生对象对应的类是 伴生类， 伴生对象的名称应该和伴生类名一致
 * 3. 伴生对象中的属性和方法是通过 类名直接调用
 * 4. 伴生对象，就是类的静态方法和成员的集合
 * 5. 从技术的角度来看， scala还是没有生成静态内容，只不过是将伴生对象生成了一个新
 * 的类，实现属性和方法的调用
 * 6.从底层原理看,伴生对象实现静态特性是依赖public static final MODULE$实现的
 * 7.伴生对象的声明应该和伴生类的声明在同一个源码文件中
 * 8
 * 9.
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