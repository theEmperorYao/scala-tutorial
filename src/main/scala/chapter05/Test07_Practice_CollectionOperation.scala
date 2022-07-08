package chapter05

/**
 * @Classname Test07_Practice_CollectionOperation
 * @Description TODO
 * @Date 2022/7/3 16:57
 * @Author by tangyao
 */
object Test07_Practice_CollectionOperation {

  def main(args: Array[String]): Unit = {

    val arr: Array[Int] = Array(23, 4, 45, 426, 2)

    // 对数组进行处理 将操作抽象出来,处理完毕之后的结果返回一个新的数组
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    def plusOne = (num: Int) => num + 1

    val newArray: Array[Int] = arrayOperation(arr, plusOne)

    for (elem <- newArray) println(elem)

    println(newArray.mkString(","))


    val newArray2: Array[Int] = arrayOperation(arr, _ * 2)

    println(newArray2.mkString(","))

  }

}
