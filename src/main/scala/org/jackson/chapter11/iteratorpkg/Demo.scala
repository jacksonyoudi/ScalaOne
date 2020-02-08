package org.jackson.chapter11.iteratorpkg


/**
 * iterator的构建实际是 AbstractIterator的一个匿名子类，该子类提供了
 * def iterator: Iterator[A] = new AbstractIterator[A] {
 * var these = self
 * def hasNext: Boolean = !these.isEmpty
 * def next(): A =
 * if (hasNext) {
 * val result = these.head; these = these.tail; result
 * } else Iterator.empty.next()
 *
 * 该AbstractIterator子类提供了 haseNext next等方法
 *
 * 因此 我们可以使用wile的方式使用 hasNext next 方法变量
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val iterator = List(1, 2, 3, 4, 5).iterator

    /**
     * def iterator: Iterator[A] = new AbstractIterator[A] {
     * var these = self
     * def hasNext: Boolean = !these.isEmpty
     * def next(): A =
     * if (hasNext) {
     * val result = these.head; these = these.tail; result
     * } else Iterator.empty.next()
     */

    //    while (iterator.hasNext) {
    //      println(iterator.next())
    //    }

    // 有一个异常判断的
    for (elem <- iterator) {
      println(elem)
    }
  }
}
