package org.jackson.chapter13.caseclasspkg

/**
 * 知识点1：将描述绑定到第一个Book的描述
 * case Bundle(_,_,Book(desc,_),_*) => desc
 *
 * 知识点2:
 * 通过 @表示法将嵌套的值绑定到变量。 _*绑定剩余item到rest
 *
 * case Bundle(_,_,art @Book(_,_), rest @_*) => (art,rest)
 */
object SalesDemo {
  def main(args: Array[String]): Unit = {

    val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Food("巧克力", 80), Book("scala", 300)))
    println(sale.price)
  }
}


// 先设计样例类
abstract class Item {

  import scala.beans.BeanProperty

  @BeanProperty def price: Double
}

case class Book(description: String, price: Double) extends Item

case class Food(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, items: Item*) extends Item {

  import scala.beans.BeanProperty

  @BeanProperty def price: Double = {
    var sum = 0.0
    for (elem <- items) {
      sum += elem.price
    }
    sum -= discount
    sum
  }
}
