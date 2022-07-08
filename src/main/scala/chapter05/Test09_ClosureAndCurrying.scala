package chapter05

/**
 * @Classname Test09_ClosureAndCurrying
 * @Description TODO
 * @Date 2022/7/4 00:16
 * @Author by tangyao
 */
object Test09_ClosureAndCurrying {

  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1、考虑固定一个加数的场景

    def addByFour(b: Int): Int = {
      4 + b
    }

    //2、拓展固定加数改变的情况

    def addByFive(b: Int): Int = {
      5 + b
    }

    // 3、将固定加数作为另一个参数传入，但是是作为第一层参数传入

    def addByFour1(): Int => Int = {
      val a = 4

      def addB(b: Int): Int = {
        a + b
      }

      addB

    }

    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }

      addB

    }

    val f1 = (x: Int, y: Int) => x + y


    println(addByA(35)(24))

    val addByFour2 = addByA(4)

    val addByFive2 = addByA(5)

    println(addByFour2(6))
    println(addByFive2(19))

    def addByA3(a: Int): Int => Int = a + _

    val addByFour3 = addByA3(4)

    val addByFive3 = addByA3(35)

    println(addByFive3(34))
    println(addByFive3(22))
    println("========")
    println(addByA3(10)(34))

    // 5、柯里化

    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }

    println(addCurrying(1)(2))
    println(addCurrying(1) _)



  }

}
