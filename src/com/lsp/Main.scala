package com.lsp

/**
 * Created by Administrator on 2015/3/13.
 */
object Main {
  def main(args: Array[String]) {
    println("this is a test")

    val list=Range(1,10)
    list.foreach(println)

    val list2=Range(1,10,2)
    list2.foreach(println)

    // add package
    val arr=new Array[String](2)
    arr(0)="this"
    arr(1)="test"
    arr.foreach(println)

    val arr1=Array(1,2,3,5)
    println(arr1.length)
  }
}

//object Hello extends App{
//  println("hello this a no main method object")
//}


