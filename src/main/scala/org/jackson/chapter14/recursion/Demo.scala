package org.jackson.chapter14.recursion

import java.text.SimpleDateFormat
import java.util.Date


/**
 * scala是运行在java虚拟机上，有以下特点
 * 1. 轻松实现和丰富的java类库互联互通
 * 2. 它既支持面向对象的编程方式也支持函数式编程
 * 3. 它写出的程序像动态语言一样简洁，但是事实上它确实是严格意义上的静态语言
 * 4. scala就像一位武林中集大成者， 将过去几十年的计算机发展历史中的精粹基于一身，化繁为简，提供了一种新的选择。
 *
 *
 * 编程范式
 * 1. 面向对象编程
 * 2. 面向对象并不是一种严格意义上的编程范式，严格意义上的编程范式： 命令式编程，函数式编程， 逻辑式编程 面向对象是这几种的交叉产物
 * 3. 函数式编程 很多使用 递归
 * 命令式 迭代式
 *
 *
 *
 * 递归的陷阱:
 * 重复计算， 如果出现多个递归计算
 * 优化: 使用迭代，减少迭代
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val now: Date = new Date()
    val simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = simpleDateFormat.format(now)
    println("执行前时间:" + date)

    var res = BigInt(0)
    var num = BigInt(1)
    var maxVal = BigInt(99999999l)

    while (num <= maxVal) {
      res += num
      num += 1
    }
    println("res=" + res)

    val now1: Date = new Date()
    val simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date1 = simpleDateFormat1.format(now1)
    println("执行前时间:" + date1)
  }
}
