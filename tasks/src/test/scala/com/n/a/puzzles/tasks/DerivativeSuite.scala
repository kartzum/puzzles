package com.n.a.puzzles.tasks

import org.scalatest.FunSuite

import scala.collection.mutable

class DerivativeSuite extends FunSuite {
  test("t1") {
    val (y, x) = generateExample1()
    val r = Derivative.calc(y, x, 0.2)
    assert(Math.abs(Math.abs(r) - Math.sin(0.2)) < 0.1)
  }

  def generateExample1(): (Array[Double], Array[Double]) = {
    val y = new mutable.ArrayBuffer[Double]()
    val x = new mutable.ArrayBuffer[Double]()
    var i = 0.0
    while (i <= 0.25) {
      y.append(Math.cos(i))
      x.append(i)
      i += 0.05
    }
    (y.toArray, x.toArray)
  }
}
