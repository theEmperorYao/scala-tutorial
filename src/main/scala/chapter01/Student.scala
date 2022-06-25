package chapter01

/**
 * @Classname Student
 * @Description TODO
 * @Date 2022/6/25 14:08
 * @Author by tangyao
 */

class Student(name: String, age: Int) {

  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }

}

// 引入伴生对象
object Student {

  val school: String = "奥特之星"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("bob", 20)
    alice.printInfo()
    bob.printInfo()

  }


}
