package com.github.actions

import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatest.matchers.should.Matchers

class ActionTest extends AnyFunSuiteLike with Matchers {

  test("action ") {
    2 == 2 shouldBe true
  }
}
