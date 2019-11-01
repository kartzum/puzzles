package com.n.a.puzzles.tasks

object Scale {
  def calc(a: Array[Array[Int]], rows: Int, cols: Int): Array[Array[Int]] = {
    val aRows = a.length
    val aCols = a(0).length
    val kR = rows.toDouble / aRows.toDouble
    val kC = cols.toDouble / aCols.toDouble
    val r = Array.ofDim[Int](rows, cols)
    for (j <- a.indices) {
      for (i <- a(j).indices) {
        val v = a(j)(i)
        val jNew = Math.floor(kR * j).toInt
        val iNew = Math.floor(kC * i).toInt
        if (r(jNew)(iNew) == 0) {
          r(jNew)(iNew) = v
        }
      }
    }
    r
  }
}
