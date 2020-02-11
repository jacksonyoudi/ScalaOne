package org.jackson.crm.bean

class Customer {
  // 属性
  var id: Int = _
  var name: String = _
  var gender: Char = _
  var age: Short = _
  var tel: String = _
  var email: String = _

  // 构造器

  // 设计辅助构造器
  def this(id: Int, name: String, gender: Char, age: Short, tel: String, email: String) {
    this
    this.id = id
    this.name = name
    this.age = age
    this.gender = gender
    this.tel = tel
    this.email = email
  }

  override def toString: String = {
    s"${this.id}\t\t${this.name}\t\t${this.gender}\t\t${this.age}\t\t${this.tel}\t\t${this.email}".toString
  }
}
