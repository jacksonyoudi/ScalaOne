package org.jackson.chapter07.inherit


/**
 * 继承
 * 1. 代码复用性提高了
 * 2. 扩展性和维护性提高了
 *
 * 子类继承了所有的属性，只是私有的属性不能直接访问，需要通过公共
 * 方法去访问
 *
 * override
 *
 *
 * scala类型的转换和检查
 * 向上或向下转型
 *
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.name = "helo"
    println(student.name)
    student.play()
    println(classOf[Student]) //使用反射机制

    val a: Person = new Student
    val b: Person = new Emp
    test(a)
    test(b)

  }

  def test(person: Person): Unit = {
    if (person.isInstanceOf[Student]) {
      println(person.asInstanceOf[Student].showStu()) // 返回一个新类型
    } else if (person.isInstanceOf[Emp]) {
      println(person.asInstanceOf[Emp].showEmp())
    }
  }
}

class Person {
  var name: String = ""
  var age: Int = 1

  def play(): Unit = {
    println("father")
  }
}

class Student extends Person {
  var stuId: Int = 100

  override def play(): Unit = {
    super.play()
    println("student")
  }

  def showStu(): Unit = {
    println("student")
  }
}

class Emp extends Person {
  var empId: Int = _

  def showEmp(): Unit = {
    println("emp")
  }
}