package com.n.a.puzzles.tasks

import scala.util.control.Breaks._

/**
  * https://en.wikipedia.org/wiki/Numerical_differentiation
  * http://aco.ifmo.ru/el_books/numerical_methods/lectures/glava1.html
  * http://window.edu.ru/resource/685/64685/files/%D1%81%D0%BE%D0%B4%D0%B5%D1%80%D0%B6%D0%B0%D0%BD%D0%B8%D0%B5.pdf
  */
object Derivative {
  def calc(y: Array[Double], x: Array[Double], xValue: Double): Double = {
    var index = -1
    breakable {
      for (i <- x.indices) {
        if (xValue < x(i)) {
          index = i - 1
          break
        }
      }
    }

    if (index != -1) {
      val y2 = y(index)
      val y1 = y(index - 1)
      val x2 = x(index)
      val x1 = x(index - 1)
      val dy = (y2 - y1) / (x2 - x1)
      dy
    } else {
      throw new IllegalArgumentException
    }
  }
}
