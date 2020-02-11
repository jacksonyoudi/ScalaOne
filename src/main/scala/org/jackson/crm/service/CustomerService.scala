package org.jackson.crm.service

import org.jackson.crm.bean.Customer

import scala.collection.mutable.ListBuffer

class CustomerService {
  // id: Int, name: String, gender: Char, age: Short, tel: String, email: String
  var customers = ListBuffer(new Customer(1, "tom", '男', 10, "110", "100@email"))

  def list(): ListBuffer[Customer] = {
    this.customers
  }
}
