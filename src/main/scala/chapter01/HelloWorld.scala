package chapter01

/**
 * @Classname HelloWorld
 * @Description TODO
 * @Date 2022/6/25 00:30
 * @Author by tangyao
 */

/**
 * object : 关键字，声明一个单例对象（伴生对象）
 * 从java角度分析， HelloWorld 是伴生对象的伴生类，HelloWorld$是伴生对象的所属类
 */
object HelloWorld {

  /**
   *
   * def 方法名称（参数名称:参数类型):返回值类型={ 方法体 }
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {

    println("hello world!")
    System.out.println("hello scala from java!")

  }


}
