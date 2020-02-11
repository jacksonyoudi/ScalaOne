package org.jackson.chapter14.recursion

/**
 *
 */


object Demo02 {
  def main(args: Array[String]): Unit = {
    val now: java.util.Date = new java.util.Date()
    val simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = simpleDateFormat.format(now)
    println("执行前时间:" + date)

    var num = BigInt(0)
    var sum = BigInt(1)
    var res = mx(num, sum)
    println("res=" + res)
    val now1: java.util.Date = new java.util.Date()
    val date2 = simpleDateFormat.format(now1)
    println("执行前时间:" + date2)

  }


  def mx(num: BigInt, sum: BigInt): BigInt = {
    if (num <= 99999999l) return mx(num + 1, sum + num)
    else return sum
  }
}
