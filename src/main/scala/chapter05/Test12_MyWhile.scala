package chapter05

import scala.Boolean

/**
 * @Classname Test12_MyWhile
 * @Description TODO
 * @Date 2022/7/8 23:30
 * @Author by tangyao
 */
object Test12_MyWhile {

  def main(args: Array[String]): Unit = {
    var n = 10

    // 1、常规的while循环

    while (n >= 1) {
      println(n)
      n -= 1
    }


    // 2、用闭包实现一个函数，将代码块作为参数传入,递归调用
    def myWhile(condition: => Boolean): (=> Unit) => Unit = {

      //内层函数需要递归调用，参数就是循环体
      def doLoop(op: => Unit): Unit = {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }

      doLoop _
    }

    n = 10
    myWhile(n >= 1) {
      println(n)
      n -= 1
    }

    println("========")

    // 3、化简 用匿名函数表达

    def myWhile2(condition: => Boolean): (=> Unit) => Unit = {

      //内层函数需要递归调用，参数就是循环体
      op => {
        if (condition) {
          op
          myWhile2(condition)(op)
        }
      }

    }

    n = 10
    myWhile2(n >= 1) {
      println(n)
      n -= 1
    }

    //3、用柯里化实现

    def myWhile3(condition: => Boolean)(op: => Unit) = {
      if (condition) {
        op
        myWhile2(condition)(op)
      }
    }

    n = 10
    myWhile3(n >= 1) {
      println(n)
      n -= 1
    }

    def myWhile11(condition: => Boolean): (=> Unit) => Unit = {

      op => {
        if (condition) {
          op
          myWhile11(condition)(op)
        }
      }
    }

    def myWhile12(condition: => Boolean)(op: => Unit): Unit = {
      if (condition) {
        op
        myWhile12(condition)(op)
      }
    }


  }

}
