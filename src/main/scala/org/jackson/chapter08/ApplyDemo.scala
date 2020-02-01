package org.jackson.chapter08


/**
 *
 */
object ApplyDemo {
  def main(args: Array[String]): Unit = {
    //    val p1 = new Pig("one")
    val p2 = Pig() // 注意 一定要有 ()
    val p3 = Pig("p3")

    println(Pig.tot)

  }
}

class Pig(inName: String) {
  var name = inName
}

object Pig {
  // 编写一个apply方法
  var tot = 0

  def apply(inName: String): Pig = {
    tot += 1
    new Pig(inName)
  }

  def apply(): Pig = {
    println("hello")
    tot += 1
    new Pig("")
  }
}
