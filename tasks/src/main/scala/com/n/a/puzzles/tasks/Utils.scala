package com.n.a.puzzles.tasks

object Utils {
  def printA(a: Array[Array[Int]]): Unit = {
    for (j <- a.indices) {
      for (i <- a(j).indices) {
        print(a(j)(i) + ", ")
      }
      println()
    }
  }
}
