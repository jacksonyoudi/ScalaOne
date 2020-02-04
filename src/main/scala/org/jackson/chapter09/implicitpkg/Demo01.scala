package org.jackson.chapter09.implicitpkg

object Demo01 {
  def main(args: Array[String]): Unit = {

    // 隐式函数，丰富mysql功能

    implicit def addDelete(mySql: MySql): DB = {
      new DB
    }

    val mySql = new MySql
    mySql.insert()
    mySql.delete()


  }
}


class MySql {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }
}