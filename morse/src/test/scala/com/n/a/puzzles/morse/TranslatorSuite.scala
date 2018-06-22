package com.n.a.puzzles.morse

import org.scalatest.{BeforeAndAfter, FunSuite}

class TranslatorSuite extends FunSuite with BeforeAndAfter {
  val translator = new Translator()

  test("code returns empty") {
    assert(translator.code("") == "")
  }

  test("code returns empty (null)") {
    assert(translator.code(null) == "")
  }

  test("code returns 'sos' result") {
    assert(translator.code("sos") == "... --- ...")
  }

  test("code returns 'abcdefghijklm' result") {
    assert(translator.code("abcdefghijklm") == ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. --")
  }

  test("code returns 'nopqrstuvwxyz' result") {
    assert(translator.code("nopqrstuvwxyz") == "-. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..")
  }
}