package model.bank

import munit.FunSuite

class BankTest extends FunSuite {

  test("A bank should start with 19 cards of each resource") {
    assertEquals(Bank.getBrickAmount, 19)
    assertEquals(Bank.getGrainAmount, 19)
    assertEquals(Bank.getLumberAmount, 19)
    assertEquals(Bank.getOreAmount, 19)
    assertEquals(Bank.getWoolAmount, 19)
  }

  test("A bank should start with a deck of 25 shuffled development cards") {
    assertEquals(Bank.getDeckSize, 25)
  }

}
