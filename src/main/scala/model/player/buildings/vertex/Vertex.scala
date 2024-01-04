package model.player.buildings.vertex

import model.player.buildings.Buildable

/**
 * Interface that represents a vertex structure. It can only be placed on the empty vertices of the
 * hexagons of the board, with the rule that two vertex structures cannot be adjacent. This means
 * that a vertex structure can only be placed on the vertices of the hexagons of the board if there
 * is no other vertex structure on the vertices of the hexagons of the board adjacent to it.
 */
trait Vertex extends Buildable {

  /** Returns the number of victory points that the vertex structure gives to the owner. */
  def getVictoryPoints: Int

  /** Returns the number of obtainable resources from the vertex structure. */
  def getObtainableResources: Int
}
