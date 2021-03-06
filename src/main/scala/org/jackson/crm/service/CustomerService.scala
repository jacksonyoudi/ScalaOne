package org.jackson.crm.service

import org.jackson.crm.bean.Customer

import scala.collection.mutable.ListBuffer

class CustomerService {
  var customersNum = 1
  // id: Int, name: String, gender: Char, age: Short, tel: String, email: String
  var customers = ListBuffer(new Customer(1, "tom", '男', 10, "110", "100@email"))

  def list(): ListBuffer[Customer] = {
    this.customers
  }

  def add(customer: Customer): Boolean = {
    this.customersNum += 1
    customer.id = this.customersNum
    customers.append(customer)
    true
  }

  def findIndexbyId(id: Int): Int = {
    var index = -1
    for (i <- 0 until customers.length) {
      if (customers(i).id == id) {
        return i
      }
    }
    index
  }

  def delete(id: Int): Boolean = {
    val index = findIndexbyId(id)
    if (index == -1) {
      return false
    }

    customers.remove(index)
    true
  }
}
