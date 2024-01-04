package model.player.buildings.vertex

import model.player.Player
import munit.FunSuite

class VertexTest extends FunSuite {

  var owner: Player = _
  var vertex: Vertex = _

  override def beforeEach(context: BeforeEach): Unit = {
    owner = new Player("Player 3", "Green")
    vertex = new Settlement(owner)
  }

  test("A vertex structure should have victory points to give to the owner") {
    assertEquals(vertex.getVictoryPoints, 1)
  }

  test("A vertex structure should have an obtainable resources value to give to the owner") {
    assertEquals(vertex.getObtainableResources, 1)
  }

}
