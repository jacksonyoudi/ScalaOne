package org.jackson.chapter11.mappkg

object Demo02 {
  def main(args: Array[String]): Unit = {
    val list = List(3, 5, 7)
    // 说明
    /**
     * list.map(multiple)
     * 1. 将list这个集合中元素 依次遍历
     * 2. 将各个元素传递给multiple 函数 =>新Int
     * 3. 将得到新Int，放入到一个新的集合中并返回
     * 4. 因此 multiple 函数被调用了3次
     */
    val list2 = list.map(multiple)
    println(list2)


    val myList = MyList()
    val list1 = myList.map(multiple)
    println(list1)
  }

  def multiple(n: Int): Int = {
    2 * n
  }
}

/**
 * 模拟实现 map
 *
 */

class MyList {
  val list1 = List(3, 5, 7)
  var list2 = List[Int]()

  def map(f: Int => Int): List[Int] = {
    // 先遍历
    for (elem <- this.list1) {
      list2 = list2 :+ f(elem)
    }
    list2
  }
}

object MyList {
  def apply(): MyList = new MyList()
}