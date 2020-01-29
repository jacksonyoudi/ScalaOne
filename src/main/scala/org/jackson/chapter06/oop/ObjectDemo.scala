package org.jackson.chapter06.oop


/**
 * 1.类申明默认是public,不要写public
 * 2. 一个scala文件中，可以定义很多个类 class,都是public
 * 3. 类的属性，可以是值类型，也可以是引用类型
 *
 * 属性
 *  1. [访问类型] var 属性名称[:类型]=属性
 *  2. 值或引用
 *  2. 必须初始默认值
 *  3. 如果是null，注意
 *  4. 默认值使用 _
 *  5. 不同对象，互不影响
 *
 *
 * 高级部分:
 * 构造器
 *
 *
 *
 * 对象：
 * val |var  name[:type] = new class()
 * :type可以省略，但是如果父类，进行多态的时候，必须指定
 *
 * 类和对象的内存分配
 *
 */
object ObjectDemo {
  def main(args: Array[String]): Unit = {

    val emp = new Emp
    val emp1: Person = new Emp
    println(emp)
    println(emp1)

    val n = 10
    val res = (0 to n).reverse
    println(res)
    // 函数(f:Int => U),即接收一个输入参数为Int,输出为u的函数
    // 将res遍历出来，将元素传给print
    //高级函数 匿名函数 _ 表示参数
    res.foreach((i) => {
      println(i)
    })

    var sum: Long = 0
    "hello".foreach({
      sum += _.toLong
    })
  }

  def myshow(n: Int): Unit = {
    println(n)
  }
}


class Person {

}

class Emp extends Person {

}


