package org.jackson.chapter07.inherit

object Demo {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.name = "helo"
    println(student.name)
  }
}

class Person {
  var name: String = ""
  var age: Int = 1
}

class Student extends Person {

}