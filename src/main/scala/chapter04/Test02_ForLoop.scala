package chapter04

import scala.collection.immutable
import scala.language.postfixOps

/**
 * @Classname Test02_ForLoop
 * @Description TODO
 * @Date 2022/7/2 21:50
 * @Author by tangyao
 */

object Test02_ForLoop {

  def main(args: Array[String]): Unit = {

    //范围遍历

    for (i <- 1 to 10) {
      println(i + " hello world!")
    }

    // 就是方法调用
    // 隐式转换
    // @inline implicit def intWrapper(x: Int)         = new runtime.RichInt(x)
    for (i <- 1.to(10).reverse) {
      println(i + " hello world!")
    }

    for (i <- 1 until 10) {
      println(i + " hello world!")


    }


    println("=========")

    //     集合遍历
    for (i <- Array(12, 43, 23)) {
      println(i)
    }

    // 循环守卫
    for (i <- 1 to 10 if i != 5) {
      println(i)
    }

    println("=========")

    //循环步长
    for (i <- 1 to 10 by 2) {
      println(i)
    }

    println("=========")
    for (i <- 13 to 30 by 3) {
      println(i)
    }

    for (i <- 80 to 30 by -2) {
      println(i)
    }

    for (i <- 1 to 10 reverse) {
      println(i)
    }

    for (i <- 1 until 10 reverse) {
      println(i)
    }


    for (data <- 1.0 to 10 by 0.3) {
      println(data)
    }

    //循环嵌套
    for (i <- 1 to 4; j <- 1 to 5) {
      println(i + " " + j)
    }


    // 循环引入变量

    for (i <- 1 to 10) {
      val j = 10 - i
      println(i + " " + j)
    }

    for (i <- 1 to 10; j = 10 - i) {
      println(i + " " + j)
    }

    for {
      i <- 1 to 10
      j = 10 - i
    } {
      println(i + " " + j)
    }


    // 循环返回值

    val a: Unit = for (i <- 1 to 10) {
      i
    }
    println("a=" + a)

    val b: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i*2
    println("b=" + b)




  }

}
