package org.jackson.chapter07.pkg


/**
 * java包的功能
 * 1. 命名空间， 相同名称的包管理
 * 2. 管理类
 * 3. 访问控制
 *
 * package
 *
 * 打包的本质就是创建不同的文件夹保存 类文件
 *
 * java对包的要求
 * 1. 类的源文件，需要和包对应的文件路径匹配
 * 2. 编译后的.class文件也是要放在对应路径下
 *
 *
 *
 * scala包
 *  1. 命名空间， 相同名称的包管理
 *  2. 管理类
 *  3. 访问控制
 *  4. 可以对类的功能进行扩展
 *
 * scala对包的要求
 * 1. 类源码文件，可以和包对应文件路径不一致
 * 2. 编译后的.class文件 是会和路径保持一致的。 编译器做的
 *
 * 包的命名:
 *
 * scala自动导入包
 *    java.lang.*
 *    scala.*   不意味着所有都可以直接使用的 io 需要引入
 *    Predef.*
 *
 * scala包的三种形式
 *  1. 一个文件中可以创建多个包，各个包中创建各个类
 *  2. 嵌套包
 *
 * 作用域
 * 子包可以直接向上使用父包
 * 1. 如果有重名的类，使用就近原则
 *
 * 父包访问子包，必须使用import
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    // 使用dog 自动推导
    val dog1 = new org.jackson.chapter07.scalaPkg.one.Dog

    // 使用Dog
    val dog2 = new org.jackson.chapter07.scalaPkg.two.Dog
  }
}


/**
 * 1. import scala.beans.BeanProperty
 *
 * @BeanProperty
 *
 * 2. @scala.beans.BeanProperty
 *
 * 绝对 包名冲突
 * 3. @_root_.scala.beans.BeanProperty
 *
 */
class Person {
  @_root_.scala.beans.BeanProperty var name: String = _
  var age: Int = _
}

package com.youdi {
  package hello {

    class Person {

      def play: Unit = {
        println("hello")
      }
    }

  }

}
