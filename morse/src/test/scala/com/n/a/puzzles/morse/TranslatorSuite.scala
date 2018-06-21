package com.n.a.puzzles.morse

import org.scalatest.{BeforeAndAfter, FunSuite}

class TranslatorSuite extends FunSuite with BeforeAndAfter {
  test("returns empty") {
    val translator = new Translator()
    val result = translator.code("")
    assert(result == "")
  }
}