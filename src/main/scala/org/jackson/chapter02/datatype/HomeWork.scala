package org.jackson.chapter02.datatype

object HomeWork {
  def main(args: Array[String]): Unit = {
    // 1.
    var f = math.sqrt(3)
    print(f)
    print("\n")
    var f2 = math.pow(f, 2)
    print(f2)

    // 2. scala编写，编译， 运行
    //  .scala -> .class -> jvm -> 运行
    // 3.
    var a: String = "one" * 3
    println(a * 3)

    var c: BigInt = BigInt.apply(2)
    var m = c.pow(1024)
    println(m)

    val s: String = "Hello"
    s.takeRight(1)
    println(s.charAt(0))
    println(s.charAt(s.length - 1))
  }

}
