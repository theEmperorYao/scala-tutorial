package chapter02

/**
 * @Classname Test08_DataTypeConversion
 * @Description TODO
 * @Date 2022/6/26 02:29
 * @Author by tangyao
 */
object Test08_DataTypeConversion {

  def main(args: Array[String]): Unit = {
    // 1、自动类型转换
    //    （1）自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成
    //    精度大的那种数据类型，然后再进行计算。

    val a1: Byte = 10
    val b1: Long = 123L

    val result1: Long = a1 + b1
    val result2: Int = (a1 + b1).toInt

    //    （2）把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动
    //    类型转换。
    val a2: Byte = 10
    val b2: Int = a2
    val c2: Byte = b2.toByte

    //    （3）（byte，short）和 char 之间不会相互自动转换。
    val a3: Byte = 10
    val b3: Char = 'b'
    //    val c3: Byte = b3.toByte
    val c3: Int = b3
    println(c3)
    //    （4）byte，short，char 他们三者可以计算，在计算时首先转换为 int 类型。

    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'c'

    val result4: Int = a4 + b4
    val result5: Int = a4 + b4 + c4

    println(result5)

    // 2、强制类型转换
    val n1: Int = -2.9.toInt
    println(n1)

    val n2: Int = (2.6 + 3.7).toInt
    println(n2)

    // 数值类型和String类型转换

    val n: Int = 27
    val s: String = n + ""
    println(s)
    val m: Int = "12".toInt

    val f: Float = "12.3".toFloat.toInt
    println(f)






  }

}
