package model.player.buildings.vertex

import model.player.Player
import munit.FunSuite

class CityTest extends FunSuite {

  var owner: Player = _
  var city: City = _

  override def beforeEach(context: BeforeEach): Unit = {
    owner = new Player("Player 4", "Green")
    city = new City(owner)
  }

  test("A city should have a cost of 2 Grain and 3 Ore") {
    assertEquals(city.getCost, Map("Grain" -> 2, "Ore" -> 3))
  }

  test("A city should not be upgradable") {
    assertEquals(city.isUpgradable, false)
  }

  test("A city should have victory points to give to the owner") {
    assertEquals(city.getVictoryPoints, 2)
  }

  test("A city should have an obtainable resources value to give to the owner") {
    assertEquals(city.getObtainableResources, 2)
  }

}
