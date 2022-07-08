package chapter05

/**
 * @Classname Test06_HighOrderFunction
 * @Description TODO
 * @Date 2022/7/3 16:19
 * @Author by tangyao
 */
object Test06_HighOrderFunction {

  def main(args: Array[String]): Unit = {

    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }

    def fun(): Int = {
      println("fun调用")
      1
    }

    val result: Int = f(123)

    println(result)

    //1、函数可以作为值进行传递
    val f1: Int => Int = f

    // 要的是f这个函数
    val f2 = f _

    println(f1)
    println(f1(12))
    println(f2)
    println(f2(23))

    println("=========")

    val f3: () => Unit = fun
    val f4 = fun _

    println(f3)
    println("=========")
    println(f4)

    // 2、函数作为参数进行传递

    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 13, 34))

    println(dualEval(_ + _, 23, 4))

    // 函数作为函数的返回值返回

    def f5() = {
      def f6(a: Int) = {
        println("f6调用 " + a)
      }
      // 将函数直接返回
      f6 _
    }

    val f6: Int => Unit = f5()
    println(f6(25))
    println(f5()(25))



  }

}
