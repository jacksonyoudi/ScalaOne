package org.jackson.chapter13.caseclasspkg

object SaleDemo01 {
  def main(args: Array[String]): Unit = {
    val sale = Bundle1("书籍", 10, Book1("漫画", 40), Bundle1("文学作品", 20, Food1("巧克力", 80), Book1("scala", 300)))
    println(price(sale))

    // 递归
    def price(it: Item1): Double = {
      it match {
        case Book1(_, p) => p
        case Food1(_, p) => p
        case Bundle1(_, discount, its@_*) => its.map(price).sum - discount
        case _ => 0
      }
    }
  }
}


// 先设计样例类
abstract class Item1

case class Book1(description: String, price: Double) extends Item1

case class Food1(description: String, price: Double) extends Item1

case class Bundle1(description: String, discount: Double, items: Item1*) extends Item1