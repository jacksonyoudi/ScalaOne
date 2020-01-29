package org.jackson.chapter07


/**
 * 1. 在包中直接写属性或方法，就错误，使用包对象解决
 * 2. package object scala表示创建一个包对象
 * 3. 每一个包都可以有一个包对象
 * 4. 包对象的名字需要和子包一样
 * 5. 在包对象中可以定义变量和方法
 * 6. 对应包内可以直接使用
 * 7. 在包的目录下， 包对象对应两个.class package.class package$.class
 */
package object pkgobj {
  var name: String = _
  var age: Int = _

  def play: Unit = {
    println("hello")
  }

}

package pkgobj {

  object Hello {
    def main(args: Array[String]): Unit = {
      println(name)
      play
    }
  }

}
