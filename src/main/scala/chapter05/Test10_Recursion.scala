package chapter05

import scala.annotation.tailrec

/**
 * @Classname Test10_Resursion
 * @Description TODO
 * @Date 2022/7/8 23:03
 * @Author by tangyao
 */
object Test10_Recursion {

  def main(args: Array[String]): Unit = {

    println(fact(5))

    println(tailFact(5))
  }

//  @tailrec
  def fact(n: Int): Int = {
    if (n == 0) {
      return 1;
    }
    fact(n - 1) * n;
  }

  // 尾递归

  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, curRes: Int): Int = {
      if (n == 0) {
        return curRes
      }
      loop(n - 1, curRes * n)

    }

    loop(n, 1)

  }


}
