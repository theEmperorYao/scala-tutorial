package chapter02

/**
 * @Classname Test09_Problem_DataTypeConversion
 * @Description TODO
 * @Date 2022/7/2 18:53
 * @Author by tangyao
 */

/**
 *
 * 128 Int 类型 占据4字节 32位
 *
 * 原码 0000 0000 0000 0000 0000 0000 1000 0000
 * 补码 0000 0000 0000 0000 0000 0000 1000 0000
 *
 * 截取最后一个字节
 * 得到 1000 0000
 * 表示最大的负数
 *
 * 128 Int 类型 占据4字节 32位
 * 原码 0000 0000 0000 0000 0000 0000 1000 0010
 * 补码 0000 0000 0000 0000 0000 0000 1000 0010
 * 截取最后一个字节
 * 得到 1000 0010
 * 表示 1111 1110
 * -126
 *
 *
 */

object Test09_Problem_DataTypeConversion {

  def main(args: Array[String]): Unit = {
    val n: Int = 130
    val b: Byte = n.toByte
    println(b)

  }

}
