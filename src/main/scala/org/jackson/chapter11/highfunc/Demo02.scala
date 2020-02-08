package org.jackson.chapter11.highfunc

object Demo02 {
  def main(args: Array[String]): Unit = {
    test2(sayok)
  }

  // 表示无参的函数
  def test2(f: () => Unit): Unit = {
    f()
  }

  def sayok(): Unit = {
    println("helo")
  }
}
