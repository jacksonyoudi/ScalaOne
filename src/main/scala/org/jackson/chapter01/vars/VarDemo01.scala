package org.jackson.chapter01.vars

object VarDemo01 {
  def main(args: Array[String]): Unit = {
    var age: Int = 10
    var sal: Double = 10.9
    var name: String = "tom"
    var isPass: Boolean = true

    // 小数默认是double类型，整数默认是int类型
    var score: Float = 70.9f

    print(s"${age} is ${isPass}")
  }
}
