package chapter02

/**
 * @Classname Test04_String
 * @Description TODO
 * @Date 2022/6/25 21:13
 * @Author by tangyao
 */
object Test04_String {

  def main(args: Array[String]): Unit = {

    val name = "alice"

    val age = 23

    println(age + "岁的" + name + "学习")

    // * 用于讲一个字符串复制多次拼接

    println(name * 3)

    printf("%d岁的%s在学习\n", age, name)

    //字符串模板
    println(s"${age}岁的${name}在学习")

    val num: Double = 2.3456

    println(s"The num is ${num}\n")

    // 格式化模板字符串
    printf(f"The num is ${num}%2.2f\n")

    // 原始格式
    println(raw"The num is ${num}%2.2f\n")

    // 三引号表示字符串，保持多行字符串的原始格式输出

    val sql =
      s"""
         |select * from
         |student
         | where
         | name = ${name}
         | and
         | age >=${age}
         |user
         |""".stripMargin
    println(sql)


  }

}
