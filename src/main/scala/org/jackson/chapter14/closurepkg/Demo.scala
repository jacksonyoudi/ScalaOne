package org.jackson.chapter14.closurepkg

/**
 * 闭包:
 * 就是一个函数和与其相关引用环境组合的的一个整体(实体)
 * 函数是一个闭包，搞清楚 返回函数引用了外部哪个变量。
 *
 * 优点:
 *
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {

    // 注意返回类型
    def makeSuffix(suffix: String): String => String = {
      (name: String) => {
        println(name.split(""))
        if (name.split(".").length == 2) {
          name
        } else {
          name + suffix
        }
      }
    }

    val f = makeSuffix(".jpg")
    println(f("one"))

  }
}
