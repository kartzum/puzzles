package com.n.a.puzzles.tasks

import com.n.a.puzzles.tasks.Utils.printA
import org.scalatest.FunSuite

class ScaleSuite extends FunSuite {
  test("t1") {
    val a = Array.ofDim[Int](6, 6)
    a(0)(0) = 1
    a(5)(5) = 1
    val r = Scale.calc(a, 3, 3)
    printA(a)
    println()
    printA(r)
  }

  test("t2") {
    println()
    val a = Array.ofDim[Int](6, 6)
    a(0)(0) = 1
    a(0)(1) = 1
    a(0)(2) = 1
    a(0)(3) = 1
    a(0)(4) = 1
    a(0)(5) = 1
    a(1)(5) = 1
    a(2)(5) = 1
    a(3)(5) = 1
    a(4)(5) = 1
    a(5)(5) = 1
    val r = Scale.calc(a, 3, 3)
    printA(a)
    println()
    printA(r)
  }
}
