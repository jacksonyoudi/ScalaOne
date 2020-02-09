package org.jackson.chapter11.streampkg


/**
 * stream是一种集合，这个集合，可以用于存放无限多个元素，但是这个无穷个元素并不会一次性生产出来，而是需要用到
 * 多大的区间，就会动态的生产，末尾元素遵循lazy规则 (要使用结果才进行计算的)
 */
object Demo {
  def main(args: Array[String]): Unit = {
    // 创建一个流
    def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n + 1)

    val stream1 = numsForm(1)
    // 取出第一个元素
    println("head=" + stream1.head)
    println(stream1.tail) // 再次触发
    println(stream1)

    println(numsForm(5).map(muti))

  }

  def muti(x: BigInt): BigInt = {
    x * x
  }
}
