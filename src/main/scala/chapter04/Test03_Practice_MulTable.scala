package chapter04

/**
 * @Classname Test03_Practice_MulTable
 * @Description TODO
 * @Date 2022/7/3 01:49
 * @Author by tangyao
 */
object Test03_Practice_MulTable {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"$j * $i = ${i * j} \t")
      }
      println()
    }

    for (i <- 1 to 9; j <- 1 to i) {

      print(s"$j * $i = ${i * j} \t")
      if (j == i) {
        println()
      }

    }


  }

}
