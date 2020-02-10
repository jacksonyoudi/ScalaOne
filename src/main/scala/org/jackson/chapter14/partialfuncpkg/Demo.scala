package org.jackson.chapter14.partialfuncpkg


/**
 * 注意类型
 *
 * 偏函数
 * 1.在对符合条件某个条件，而不是所有情况进行逻辑操作时，使用偏函数是一个不错的选择
 * 2. 在包在大括号内的一组case语句封装成函数，我们称为偏函数，它只是对会作用于指定类型的参数或指定范围值的参数实时计算，超出
 * 范围的值会忽略。
 * 3. 偏函数在scala中是一个特质PartialFunction
 */
object Demo {
  def main(args: Array[String]): Unit = {

    def isNumber(n: Any): Boolean = {
      n.isInstanceOf[Int]
    }

    def isInt(n: Any): Int = {
      n.asInstanceOf[Int]
    }

    def ad(n: Int): Int = {
      n + 1
    }

    val l = List(1, 2, 3, 4, "abc")
    println(l.filter(isNumber).map(isInt).map(ad))

    println(l.map(add))

    // 模式匹配
    // List(2, 3, 4, 5, ())
    def add(i: Any): Any = {
      i match {
        case x: Int => x + 1
        case _ =>
      }
    }
  }
}


