package chapter05

/**
 * @Classname Test05_Lambda
 * @Description TODO
 * @Date 2022/7/3 13:54
 * @Author by tangyao
 */
object Test05_Lambda {

  def main(args: Array[String]): Unit = {
    val fun = (name: String) => println(name)

    fun("aaa")

    def f(func: String => Unit): Unit = {
      func("tangyao")
    }

    f(fun)


    // 匿名函数简化


    f(println(_))


    f(println)

    // 实际实例，定义一个二元运算函数，之操作1和2两个数，但是具体预算通过参数插入
    def dualFunctionOneAndTwo(fun: (Int, Int) => Int) = fun(1, 2)

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b

    println(dualFunctionOneAndTwo(_ + _))
    println(dualFunctionOneAndTwo(-_ + _))



  }

}
