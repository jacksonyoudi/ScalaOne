package org.jackson.chapter01.vars

/**
 * 类型推导
 * 类型一旦确定就不能换类型  强类型语言
 * 定义变量的时候 可以使用var或val
 *    1. 实际编程，创建对象后，读取和修改对象属性的场景多，很少重新实例化对象 推荐使用val
 * val没有线程问题，效率高，推荐使用val
 *    2. 如果对象需要变化，则使用var
 *    3. val 相当于java中 final关键字
 */
object VarDemo02 {
  def main(args: Array[String]): Unit = {
    var num = 10
    // idea自动识别
    // 使用isinstanceOf[]判断
    print(num.isInstanceOf[Int])


    var age = 10
    age = 30 // var声明的变量，可以修改

    val num2 = 30
    //    num2 = 40 varb不可变

    val dog = new Dog()
    //    dog = new Dog
    dog.age = 10
    dog.name = "hello"
  }
}


class Dog {
  var age: Int = _ // 默认值
  var name: String = ""
}