package org.jackson.chapter07.importdemo

import java.util.{HashMap => JavaHashMap, List}

/**
 * 缩小作用域，提高效率
 * 1. 需要时，再引入，在类中使用
 * 2. import scala.beans._ 导入所有的包
 * 3. 选择器   import scala.beans.{BeanProperty, BooleanBeanProperty}
 * 4. 重命名 import java.util.{HashMap => JavaHashMap, List}
 * 直接隐藏 import java.util.{HashMap => _, _}
 *
 *
 */
object Demo {
  def main(args: Array[String]): Unit = {
    val user = new User
  }
}


// 局部引入
class User {

  import scala.beans.{BeanProperty, BooleanBeanProperty}

  @BeanProperty var name: String = _

}
