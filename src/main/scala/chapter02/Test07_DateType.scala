package chapter02

import chapter01.Student

import scala.runtime.Nothing$
import scala.xml.Null

/**
 * @Classname Test07_DateType
 * @Description TODO
 * @Date 2022/6/26 01:27
 * @Author by tangyao
 */
object Test07_DateType {

  def main(args: Array[String]): Unit = {
    val a1: Byte = 127
    val a2: Byte = -128

    val a3 = 12

    val a4 = 12353141432515L


    val b1: Byte = 10
    val b2: Byte = 10 + 20

    println(b2)

    val b3: Byte = (b1 + 20).toByte
    println(b3)

    // 2、浮点类型
    val f1: Float = 1.2345F
    val d1: Double = 123.123

    //3、字符类型
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '9'
    println(c2)

    val c3: Char = '\t'
    val c4: Char = '\n'
    println("abc" + c3 + "def")
    println("abc" + c4 + "def")

    // 转义字符
    val c5 = '\\'
    println(c5)

    val c6 = "\""
    println(c6)


    // 字符变量底层ASCII
    val i1: Int = c1;
    println(i1)
    val i2: Int = c2;
    println(i2)

    val c7: Char = (i1 + 1).toChar
    println(c7)

    val c8: Char = (i2 - 1).toChar
    println(c8)

    // 布尔类型

    val isTrue = true
    println(isTrue)


    // 空类型
    def m1(): Unit = {
      println("m1 被调用执行")
    }

    val a = m1()

    println("a: " + a)

    // 空引用Null

    //    val n: Int = null //error
    var student = new Student("alice", 20)
    student = null
    println(student)

    // Nothing

    def m2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException()
      else {
        n
      }
    }

    val b = m2(1)
    println(b)

  }


}
