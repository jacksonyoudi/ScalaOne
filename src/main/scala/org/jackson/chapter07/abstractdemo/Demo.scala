package org.jackson.chapter07.abstractdemo

/**
 * 封装： 数据和操作 绑定在一起，隐藏细节，安全
 * 1. 将属性进行私有化
 * 2. 提供一个get set public方法  加上业务逻辑的判断和限制
 *
 * 继承:
 *
 *
 * javap:可以查看.class文件的反编译的方法声明
 * javap -c  查看汇编的代码
 * []泛型
 *
 * 构造器:实例化类的同时，进行初始化，注意点，
 *
 */

object Demo {
  def main(args: Array[String]): Unit = {
    val account = new Account("youdi", 8090, "1234")
    account.query("1234")
    println(account.withdraw("1234", 100))
    account.query("1234")
  }
}

class Account(inAcount: String, inBalance: Double, inPwd: String) {
  val account = inAcount
  private var balance: Double = inBalance
  private var pwd = inPwd

  def query(pwd: String): Unit = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }
    println("account:" + this.account + "balance:" + this.balance)
  }

  def withdraw(pwd: String, money: Double): Any = {
    if (!this.pwd.equals(pwd)) {
      println("密码错误")
      return
    }

    if (money <= 0) {
      println("money err")
      return
    }
    if (money > this.balance) {
      println("no money")
      return
    }
    this.balance -= money
    money
  }

}

