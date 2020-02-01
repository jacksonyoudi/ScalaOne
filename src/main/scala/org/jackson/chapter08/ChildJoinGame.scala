package org.jackson.chapter08

object ChildJoinGame {
  def main(args: Array[String]): Unit = {
    val a = new Child("a")
    val b = new Child("b")
    val c = new Child("c")
    Child.joinGame(a)
    Child.joinGame(b)
    Child.joinGame(c)

    println(Child.tot)
  }
}

class Child {
  var name = ""

  def this(name: String) {
    this
    this.name = name
  }
}

object Child {
  //统计
  var tot = 0

  def joinGame(child: Child): Unit = {
//    println(child.name)
    tot += 1
  }

}
