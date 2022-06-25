package chapter02

import scala.io.StdIn

/**
 * @Classname Test05_StdIn
 * @Description TODO
 * @Date 2022/6/26 00:39
 * @Author by tangyao
 */
object Test05_StdIn {

  def main(args: Array[String]): Unit = {

    println("请输入您的大名：")
    val name = StdIn.readLine()
    println("请输入您的芳龄：")
    val age = StdIn.readInt()

    println(s"欢迎 ${age} 岁的 ${name} 来学习")


  }

}
