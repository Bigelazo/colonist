package model.player

import munit.FunSuite

class PlayerTest extends FunSuite {

  var player: Player = _
  val name: String = "Player 1"
  val color: String = "Blue"

  override def beforeEach(context: BeforeEach): Unit = {
    player = new Player(name, color)
  }

  test("A player should have a name, a color and start with a victory points counter set to 0") {
    assertEquals(player.name, "Player 1")
    assertEquals(player.color, "Blue")
    assertEquals(player.getVictoryPoints, 0)
  }

  test("A player should start with 5 settlements, 4 cities and 15 roads") {
    assertEquals(player.getSettlements, 5)
    assertEquals(player.getCities, 4)
    assertEquals(player.getRoads, 15)
  }

  test("A player should start with an empty hand of resource cards") {
    assertEquals(player.getResourceCards("Brick"), 0)
    assertEquals(player.getResourceCards("Grain"), 0)
    assertEquals(player.getResourceCards("Lumber"), 0)
    assertEquals(player.getResourceCards("Ore"), 0)
    assertEquals(player.getResourceCards("Wool"), 0)
  }

  test("A player should start with an empty hand of development cards") {
    assertEquals(player.getDevelopmentCards("Knight"), 0)
    assertEquals(player.getDevelopmentCards("Victory Point"), 0)
    assertEquals(player.getDevelopmentCards("Road Building"), 0)
    assertEquals(player.getDevelopmentCards("Year of Plenty"), 0)
    assertEquals(player.getDevelopmentCards("Monopoly"), 0)
  }

  test("A player should have a road counter and a army counter") {
    assertEquals(player.getPlacedRoads, 0)
    assertEquals(player.getArmy, 0)
  }

  test("A player should know if it has the longest road or if it has the largest army") {
    assertEquals(player.hasLongestRoad, false)
    assertEquals(player.hasLargestArmy, false)
  }

}
