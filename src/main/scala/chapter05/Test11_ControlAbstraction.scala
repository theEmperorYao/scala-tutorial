package chapter05

/**
 * @Classname Test11_ControlAbstraction
 * @Description TODO
 * @Date 2022/7/8 23:20
 * @Author by tangyao
 */
object Test11_ControlAbstraction {

  def main(args: Array[String]): Unit = {
    def f0(a: Int) = {
      println("a:" + a)
      println("a:" + a)
    }

    f0(23)

    def f1() = {
      println("f1调用")
      12
    }

    f0(f1())

    println("=========")
    //2、传名参数 传递的不再是具体的值，而是代码块

    def f2(a: => Int) = {
      println("a:" + a)
      println("a:" + a)
    }

    f2(f1())

    println("====")
    f2(11)

    f2({
      println("这是一个代码块")
      10
    })




  }

}
