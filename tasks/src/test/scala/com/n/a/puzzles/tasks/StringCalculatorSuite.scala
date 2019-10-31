package com.n.a.puzzles.tasks

import org.scalatest.FunSuite

class StringCalculatorSuite extends FunSuite {
  test("t1") {
    val r = StringCalculator.calculate("0a1b2c2c0c1a")
    assert(r == "abccac")
  }

  test("t2") {
    val r = StringCalculator.calculate("2a0c1b2c0a")
    assert(r == "cbaac")
  }
}
