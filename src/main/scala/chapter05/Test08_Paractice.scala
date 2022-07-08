package chapter05

/**
 * @Classname Test08_Paractice
 * @Description TODO
 * @Date 2022/7/3 17:11
 * @Author by tangyao
 */
object Test08_Paractice {
  def main(args: Array[String]): Unit = {


    def fun(a: Int, b: String, c: Char) = if (a == 0 && "" == b && c == '0') false else true

    val fun1 = (a: Int, b: String, c: Char) => if (a == 0 && "" == b && c == '0') false else true

    println(fun(0, "", '0'))
    println(fun(1, "", '0'))


    def func(a: Int): String => (Char => Boolean) = {

      def f1(b: String): Char => Boolean = {

        def f2(c: Char): Boolean = {
          if (a == 0 && "" == b && c == '0') false else true
        }

        f2
      }

      f1
    }

    println("=======")
    println(func(0)("")('0'))
    println(func(2)("")('0'))

    def func1(a: Int): String => Char => Boolean =
      b => c => !(a == 0 && "" == b && c == '0')


    println(func1(0)("")('0'))
    println(func1(1)("")('0'))

    // 柯里化

    def func2(a: Int)(b: String)(c: Char): Boolean =
      !(a == 0 && "" == b && c == '0')


    println(func2(0)("")('0'))
    println(func2(1)("")('0'))

  }
}
