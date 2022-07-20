package chapter06

import scala.beans.BeanProperty

/**
 * @Classname Test03_Class
 * @Description TODO
 * @Date 2022/7/9 18:07
 * @Author by tangyao
 */
object Test03_Class {

  def main(args: Array[String]): Unit = {

    val student = new Student()

    println(student.getAge())
    println(student.sex)
    student.sex = "female"

    println(student.sex)

  }
}

class Student {


  private var name: String = _
  @BeanProperty
  var age: Int = _

  var sex: String = _

}
