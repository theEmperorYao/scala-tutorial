package chapter05

/**
 * @Classname Test04_Simplify
 * @Description TODO
 * @Date 2022/7/3 13:37
 * @Author by tangyao
 */
object Test04_Simplify {

  def main(args: Array[String]): Unit = {

    def f0(name: String) = name

    println(f0("tangyao"))

    // 过程
    def f5(name: String) {
      println("aaa")
    }

    println(f5("dfdf"))


    def f6 {

      println("aaa")
    }

    println(f6)

    println("===========")

    val stringToUnit = (name: String) => println(name)

    stringToUnit.apply("tang")




  }

}
