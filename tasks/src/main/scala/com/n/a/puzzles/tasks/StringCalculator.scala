package com.n.a.puzzles.tasks

import scala.collection.mutable

object StringCalculator {
  def calculate(s: String): String = {
    val chars = s.toCharArray
    val m = new mutable.HashMap[Int, collection.mutable.ArrayBuffer[Character]]()
    val keys = new collection.mutable.TreeSet[Int]()
    var i: Int = -1
    for (c <- chars) {
      if (i == -1) {
        i = c.toInt
        keys += i
      } else {
        val s = m.getOrElseUpdate(i, new collection.mutable.ArrayBuffer[Character]())
        s.append(c)
        i = -1
      }
    }
    var max = -1
    m.foreach(i => {
      if (i._2.size > max) {
        max = i._2.size
      }
    })
    val r = new mutable.StringBuilder()
    for (i <- Range(0, max)) {
      keys.foreach(k => {
        val s = m(k)
        val t = new mutable.StringBuilder()
        if (i < s.length) {
          t.append(s(i))
        }
        r.append(t.toString)
      })
    }
    r.toString
  }
}
