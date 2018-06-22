package com.n.a.puzzles.easy

import org.scalatest.{BeforeAndAfter, FunSuite}

class EasyMathSuite extends FunSuite with BeforeAndAfter {

  test("cos(0, 90, 180, 10, 45)") {
    assert(EasyMath.tolerance(EasyMath.cos(math.toRadians(0)), math.cos(math.toRadians(0))))
    assert(EasyMath.tolerance(EasyMath.cos(math.toRadians(90)), math.cos(math.toRadians(90))))
    assert(EasyMath.tolerance(EasyMath.cos(math.toRadians(180)), math.cos(math.toRadians(180))))

    assert(EasyMath.tolerance(EasyMath.cos(math.toRadians(10)), math.cos(math.toRadians(10))))
    assert(EasyMath.tolerance(EasyMath.cos(math.toRadians(45)), math.cos(math.toRadians(45))))
  }
}