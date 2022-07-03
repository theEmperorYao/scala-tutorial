package chapter04

import scala.io.StdIn

/**
 * @Classname Test01_IfElse
 * @Description TODO
 * @Date 2022/7/2 21:33
 * @Author by tangyao
 */

object Test01_IfElse {

  def main(args: Array[String]): Unit = {
    println("请输入您的年龄")
    val age = StdIn.readInt()

    if (age >= 18) {
      println("成年")
    }

    println("============")

    val a: Any = if (age >= 18) {
      println("成年")
      "1"
    } else {
      println("未成年")
      3434
    }

    println(a)

  }

}
