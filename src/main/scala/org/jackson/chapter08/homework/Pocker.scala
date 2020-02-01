package org.jackson.chapter08.homework


/**
 * type可以给类型别名
 * Enumeration
 */
object Pocker {
  def main(args: Array[String]): Unit = {
    type MyInt = Int


    val num: MyInt = 888
    println("name1", num)

    println(Suits)
    println(Suits.isA(Suits.A))


  }
}

object Suits extends Enumeration {
  type Suits = Value

  // 四个实例
  val A = Value("a")
  val B = Value("b")
  val C = Value("c")
  val D = Value("d")

  override def toString(): String = {
    this.values.mkString(",")
  }

  def isA(suits: Suits): Boolean = {
    if (suits.equals(this.A)) {
      return true
    }
    return false
  }

}
