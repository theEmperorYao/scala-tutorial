package chapter03

import scala.language.postfixOps

/**
 * @Classname Test01_TestOperator
 * @Description TODO
 * @Date 2022/7/2 19:04
 * @Author by tangyao
 */

object Test01_TestOperator {

  def main(args: Array[String]): Unit = {

    val result: Int = 10 / 3
    println(result)

    val result2: Double = 10.0 / 3
    println(result2.formatted("%5.2f"))

    println("%.2f".format(result2))

    val result4 = 10 % 3
    println(result4)


    //比较运算符

    val s1 = "hello"
    val s2 = new String("hello");
    println(s1 == s2)
    println(s1.equals(s2))

    val bool = s1.eq(s2)
    println(bool)

    def m(n: Int): Int = {
      println("m被调用")
      n
    }

    val n = 1
    println((4 > 5) & m(n) > 0)

    // 判断一个字符串是否为空

    def isNotEmpty(str: String): Boolean = {
      (str != null) && !(str.trim == "")

    }

    println(isNotEmpty(null))

    // 赋值运算符

    val b: Byte = 10

    //    b += 1
    //    b.toInt += 1
    println(b)

    // & 都为一才是1 ，否则为0
    // | 有一个1 就为1
    //  00 11 11 00
    //  11 00 00 11
    //  10 11 11 01

    //  10 11 11 01
    println("-----------------")


    // 1 000 1010 补码
    // 1 111 0110 原码

    // 1 001 1101 无符号右移
    // 1 110 0011 补码

    // -10
    // 1 000 1010

    // 11110110
    // 10001010
    val value = ((-10)).toBinaryString
    println("value:" + value)


    val a: Int = -10
    // 11111111111111111111111111110110
    // 00111111111111111111111111111101 补码
    // 11111111111111111111111111111101

    //    11111111111111111111111111111101
    //10000000000000000000000000000011

    //

    //    println(a >> 2) // 2
    println(a >>> 2) // -2

    //    val i = Integer.parseInt("00111111111111111111111111111101", 2)
    //    println("i==" + i)
    //    val i1 = Integer.parseInt("10000000000000000000000000000011", 2)
    //    println("i1==" + i1)

    println(13 >> 2)

    val n1 = 12
    val n2 = 37

    // 合成方法，编译器自动生成的，绕过jvm的限制
    println(n1.+(n2))

    println(7.5 toInt)


  }

}
