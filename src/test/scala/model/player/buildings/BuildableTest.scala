package model.player.buildings

import model.player.Player
import model.player.buildings.edge.Road
import munit.FunSuite

import scala.collection.mutable

class BuildableTest extends FunSuite {

  var building: Buildable = _
  var owner: Player = _
  val cost: mutable.Map[String, Int] = mutable.Map("Brick" -> 1, "Lumber" -> 1)


  override def beforeEach(context: BeforeEach): Unit = {
    owner = new Player("Player 2", "Red")
    building = new Road(owner)
  }

  test("A building should have a cost") {
    assertEquals(building.getCost, Map("Brick" -> 1, "Lumber" -> 1))
  }

  test("A building should have an owner") {
    assertEquals(building.getOwner, owner)
  }

  test("A building should know if it's upgradable") {
    assertEquals(building.isUpgradable, false)
  }

  test("A building should know if it's placed on the board") {
    assertEquals(building.isPlacedOnBoard, false)
  }
}
