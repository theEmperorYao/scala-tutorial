package com {

  import com.atguigu.Inner

  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }
  package atguigu {
    object Inner {

      val in: String = "in"

      def main(args: Array[String]): Unit = {
        println(Outer.out) //子包访问父包无需导包
        Outer.out = "outer"
        println(Outer.out)

      }
    }
  }

}

// 在同一文件中定义多个包

//package aaa {
//  package bbb {
//    Object Test01_Package{
//
//    def main(args: Array[String]): Unit = {
//    println("aaa")
//  }
//  }
//
//}
//
//}