package org.jackson.chapter05.trycatch

/**
 * 1. try catch { case }
 * 2. 没有编译异常
 * 3. throw new Exption
 * 4. case进行匹配
 * 5. 范围也是顺序,不过不会报错
 * 6. 也有finally
 * 7. throws注解
 */
object Demo {
  def main(args: Array[String]): Unit = {
    try {
      throw new Exception("异常")
      val r = 10 / 0
    } catch {
      case ex: ArithmeticException => {
        println("ArithmeticException")
      }
      case ex: Exception => {
        ex.printStackTrace()
      }


    } finally {
      println("hello")
    }
  }

  def test(): Nothing = {
    throw new Exception("异常")
  }
}
