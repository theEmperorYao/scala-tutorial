package chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks._

/**
 * @Classname Test06_Break
 * @Description TODO
 * @Date 2022/7/3 02:28
 * @Author by tangyao
 */
object Test06_Break {
  // 采用抛出异常方式退出循环
  def main(args: Array[String]): Unit = {
    try {
      for (i <- 0 until 5) {
        println(i)
        if (i == 3) {
          throw new RuntimeException
        }

      }
    } catch {
      case e: Exception => // 什么都不做，只是退出循环
    }
    println("这是循环外的代码")


    // 使用scala中的Breaks类的break,实现异常的抛出和捕捉
    Breaks.breakable(
      for (i <- 0 until 5) {
        println(i)
        if (i == 3) {
          Breaks.break()
        }

      })
    println("这是循环外的代码")

    breakable(
      for (i <- 0 until 5) {
        println(i)
        if (i == 3) {
          Breaks.break()
        }

      })
    println("这是循环外的代码")
  }


}
