package com.n.a.puzzles.morse

import scala.collection.immutable.HashMap

class Translator {
  val alphabetFromLatToMorse: HashMap[String, String] = scala.collection.immutable.HashMap[String, String](
    "a" -> ".-",
    "b" -> "-...",
    "c" -> "-.-.",
    "d" -> "-..",
    "e" -> ".",
    "f" -> "..-.",
    "g" -> "--.",
    "h" -> "....",
    "i" -> "..",
    "j" -> ".---",
    "k" -> "-.-",
    "l" -> ".-..",
    "m" -> "--",
    "n" -> "-.",
    "o" -> "---",
    "p" -> ".--.",
    "q" -> "--.-",
    "r" -> ".-.",
    "s" -> "...",
    "t" -> "-",
    "u" -> "..-",
    "v" -> "...-",
    "w" -> ".--",
    "x" -> "-..-",
    "y" -> "-.--",
    "z" -> "--.."
  )

  val alphabetFromMorseToLat: HashMap[String, String] = scala.collection.immutable.HashMap[String, String](
    ".-" -> "a",
    "-..." -> "b",
    "-.-." -> "c",
    "-.." -> "d",
    "." -> "e",
    "..-." -> "f",
    "--." -> "g",
    "...." -> "h",
    ".." -> "i",
    ".---" -> "j",
    "-.-" -> "k",
    ".-.." -> "l",
    "--" -> "m",
    "-." -> "n",
    "---" -> "o",
    ".--." -> "p",
    "--.-" -> "q",
    ".-." -> "r",
    "..." -> "s",
    "-" -> "t",
    "..-" -> "u",
    "...-" -> "v",
    ".--" -> "w",
    "-..-" -> "x",
    "-.--" -> "y",
    "--.." -> "z"
  )

  def code(text: String): String = {
    val resultBuffer = new StringBuilder

    if (text != null) {
      val textSize = text.length

      if (textSize > 0) {
        for (i <- 0 until textSize) {
          val c = text.charAt(i).toString
          val d = alphabetFromLatToMorse.get(c)
          resultBuffer.append(d.getOrElse(""))
          if (i < textSize - 1) {
            resultBuffer.append(" ")
          }
        }
      }
    }

    resultBuffer.toString()
  }

  def decode(text: String): String = {
    val resultBuffer = new StringBuilder

    if (text != null) {
      val textSize = text.length

      if (textSize > 0) {
        val parts: Array[String] = text.split(" ")
        for (i <- parts.indices) {
          val part = parts(i)
          val d = alphabetFromMorseToLat.get(part)
          resultBuffer.append(d.getOrElse(""))
        }
      }
    }

    resultBuffer.toString()
  }
}