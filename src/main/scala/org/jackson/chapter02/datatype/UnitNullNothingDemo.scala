package org.jackson.chapter02.datatype

object UnitNullNothingDemo {
  def main(args: Array[String]): Unit = {
    val result = sayHello()
    print(result)
    // null类似java中null，可以表示所有的anyref 引用类型
    val dog: Dog = null
//    val char1: Char = null
    print("ok-----")
  }

  // unit等价于void, 只有一个实例()
  def sayHello(): Unit = {

  }


}

class Dog {

}
