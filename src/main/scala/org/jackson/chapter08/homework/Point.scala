package org.jackson.chapter08.homework


object P {
  def main(args: Array[String]): Unit = {
    println(args.reverse)
    val point = new Point
    point.play()
  }
}


object Point {

  def apply(inX: Int, inY: Int): Point = {
    new Point(inX, inY)
  }
}

class Point(inX: Int = 0, inY: Int = 0) {
  var x: Int = inX
  var y: Int = inY

  def play(): Unit = {
    println(this.x, this.y)
  }

}