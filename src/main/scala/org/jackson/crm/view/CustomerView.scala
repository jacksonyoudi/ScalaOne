package org.jackson.crm.view

import org.jackson.crm.bean.Customer
import org.jackson.crm.service.CustomerService

import scala.io.StdIn

class CustomerView {
  // 定义一个变量控制是否退出
  var loop = true
  // 定义 key
  var key = ' '
  private val service = new CustomerService

  def mainMenu(): Unit = {
    do {
      println("-------------------客户管理软件-------------------------")
      println("                   1. 添加客户")
      println("                   2. 修改客户")
      println("                   3. 删除客户")
      println("                   4. 客户列表")
      println("                   5. 退出")
      print("请选择(1-5): ")
      key = StdIn.readChar()
      key match {
        case '1' => this.add()
        case '2' => println("修改客户")
        case '3' => this.delete
        case '4' => this.list()
        case '5' => this.loop = false
        case _ => println(key + "输入不合法")
      }
    } while (loop)

    println("退出")
  }

  def list(): Unit = {
    println()
    println("------------------------客户列表-----------------------------")
    println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱")
    for (elem <- this.service.customers) {
      //      println(s"{$elem.id}\t\t{$elem.name}\t\t{${elem.gender}}\t\t{${elem.age}}\t\t{${elem.tel}}\t\t{${elem.email}}")
      println(elem)
    }
    println("------------------------客户列表完成--------------------------")

  }

  def add(): Unit = {
    var custer = new Customer()
    println()
    println("---------------------添加客户-------------------------------")
    print("姓名:")
    custer.name = StdIn.readLine()

    print("性别:")
    custer.gender = StdIn.readChar()

    print("年龄:")
    custer.age = StdIn.readShort()

    print("电话:")
    custer.tel = StdIn.readLine()

    print("email:")
    custer.email = StdIn.readLine()

    this.service.add(custer)
    println("-----------添加客户 ok------------------------------------")
  }

  def delete(): Unit = {
    println()
    println("---------------------删除客户-------------------------------")
    print("请输入待删除的编号id (-1退出):")
    var id = StdIn.readInt()
    if (id == -1) {
      println("放弃删除")
      return
    }

    print("确认删除(Y/N):")
    var choice = StdIn.readChar().toLower
    if (choice == 'y') {
      val bool = this.service.delete(id)
      if (bool) {
        println("删除成功")
      } else {
        println("删除失败，可能是id不存在")
      }
    } else {
      println("放弃删除")
    }


  }
}
