package com.n.a.puzzles.easy

object EasyMath {
  def cos(x: Double): Double = {
    var result = 0.0
    for (n <- 0 until 7) {
      val step = if (n == 0) 1 else math.pow(-1, n) * math.pow(x, 2 * n) / factorial(2 * n)
      result += step
    }

    result
  }

  def factorial(n: Int): Int = {
    var result = 1
    for (i <- 1 to n) {
      result *= i
    }
    result
  }

  def tolerance(x: Double, y: Double, precision: Double = 0.01) = {
    if ((x - y).abs < precision) true else false
  }
}