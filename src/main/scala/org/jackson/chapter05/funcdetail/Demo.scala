package org.jackson.chapter05.funcdetail


/**
 * 1. 函数参数可以多个，如果函数没有参数，调用是 可以不带()
 * 2. 形参列表和返回值列表可以是值和引用类型
 * 3. 可以不写return，最后一个函数， 返回值类型也可以省略
 * 4. 如果有使用return, 返回值类型必须指定， 如果返回值类型没有写，表示没有返回值
 * 5. 返回类型 unit,无论是否有return,都没有返回值
 * 6. 如果明确函数没有返回值或者不确定返回类型，可以不指定(自动解析)或使用any
 * 7. 函数中嵌套，私有函数
 * 8. 可以设置默认值(=)
 * 9. 位置默认值 (名称参数)
 * 10. scala形参默认是val
 * 11. 递归函数未执行前是无法推断出来结果，在使用时必须有明确的返回值类型
 * 13. 可变参数 (args: Int*)
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val tiger = new Tiger
    println(test01(2, tiger).name)
  }

  def test01(n1: Int, tiger: Tiger): Tiger = {

    println("n1=" + n1)
    tiger.name = "hello"
    return tiger
  }
}

class Tiger {
  var name = ""
}

