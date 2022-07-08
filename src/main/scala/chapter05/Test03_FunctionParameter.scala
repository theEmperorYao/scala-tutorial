package chapter05

import scala.util.control.Breaks.break

/**
 * @Classname Test03_FunctionParameter
 * @Description TODO
 * @Date 2022/7/3 13:26
 * @Author by tangyao
 */
object Test03_FunctionParameter {

  def main(args: Array[String]): Unit = {

    def f1(str: String*): Unit = {
      println(str)
    }

    f1("aaa")
    f1("aaa", "bbb")
    f1("aaa", "bbb", "cc")
    f1()

    def f2(str1: String, str2: String*): Unit = {
      println("str1:" + str1 + " str2" + str2)
    }

    f2("aaa", "bbb", "ccc")


    def f3(name: String = "tangyao"): Unit = {
      println(name + "打败了成龙")
    }

    f3()
    f3("阿福")


    def f4(name: String = "tangyao", age: Int): Unit = {
      println(s"${age}岁的${name}在学习")
    }

    f4("tangyao", 11)
    f4(age = 234)


  }

}
