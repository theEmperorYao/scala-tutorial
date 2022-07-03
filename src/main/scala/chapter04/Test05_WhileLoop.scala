package chapter04

/**
 * @Classname Test05_WhileLoop
 * @Description TODO
 * @Date 2022/7/3 02:21
 * @Author by tangyao
 */
object Test05_WhileLoop {

  def main(args: Array[String]): Unit = {
    //while

    var a = 10

    while (a >= 1) {
      println("this is a while loop " + a)
      a -= 1
    }

    var b = 0

    do {
      println("this is a do-while loop: " + b)
      b -= 1
    } while (b > 0)
    

  }

}
