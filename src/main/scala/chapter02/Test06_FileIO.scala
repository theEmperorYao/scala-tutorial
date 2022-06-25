package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

/**
 * @Classname Test06_FileIO
 * @Description TODO
 * @Date 2022/6/26 00:42
 * @Author by tangyao
 */
object Test06_FileIO {

  def main(args: Array[String]): Unit = {
    //1、从文件中读取数据

    val url = "src/main/resources/test.txt"
    Source.fromFile(url).foreach(print)

    //2、将数据写入文件
    val writer = new PrintWriter(new File("src/main/resources/output.txt "))

    writer.write("hello scala from java writer ")
    writer.close()


  }

}
