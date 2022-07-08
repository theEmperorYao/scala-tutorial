package chapter05

/**
 * @Classname Test01_FuntionAndMethod
 * @Description TODO
 * @Date 2022/7/3 13:14
 * @Author by tangyao
 */
object Test01_FuntionAndMethod {
  def main(args: Array[String]): Unit = {

    //
    def sayHi(name: String): Unit = {
      println("hi," + name)
    }

    sayHi("tangyao")

    Test01_FuntionAndMethod.sayHi("tangyao")

  }

  //
  def sayHi(name: String): Unit = {
    println("Hi," + name)
  }

}
