/**
 * @Classname package
 * @Description TODO
 * @Date 2022/7/9 17:52
 * @Author by tangyao
 */
package object chapter06 {
  // 定义当前包共享的属性和方法

  val commonValue = "奥特之星"

  def commonMethod() = {
    println(s"我们在${commonValue}学习")
  }
}
