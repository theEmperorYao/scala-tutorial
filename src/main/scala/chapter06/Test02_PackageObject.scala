//package chapter06
//
///**
// * @Classname Test02_PackageObject
// * @Description TODO
// * @Date 2022/7/9 17:54
// * @Author by tangyao
// */
//object Test02_PackageObject {
//
//  def main(args: Array[String]): Unit = {
//    commonMethod()
//    println(commonValue)
//
//  }
//
//}

package chapter06 {
  object Test02_PackageObject {

    def main(args: Array[String]): Unit = {
      commonMethod()
      println(commonValue)

    }
  }
}

package ccc {
  package ddd {
    object Test02_PackageObject {
      def main(args: Array[String]): Unit = {
        println(school)
      }
    }

  }

}

package object ccc {
  val school: String = "奥特之星"
}