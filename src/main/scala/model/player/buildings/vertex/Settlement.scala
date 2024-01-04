package model.player.buildings.vertex

import model.player.Player
import model.player.buildings.Building

/**
 * Represents a settlement. A settlement is a vertex building that can be placed on the board.
 * It has a cost of resources, an owner, and it can be upgraded.
 *
 * @constructor creates a new settlement owned by the specified player, with a cost of 1 Brick, 1
 *              Grain, 1 Lumber and 1 Wool. The settlement is upgradable.
 * @param owner the owner of the settlement.
 * @example {{{
 *          val owner: Player = new Player("Player 1", "Blue")
 *          val settlement: Settlement = new Settlement(owner)
 *          Creates a settlement owned by "Player 1", with the a cost of 1 Brick, 1 Grain, 1 Lumber
 *          and 1 Wool. The settlement is upgradable.
 * }}}
 */
class Settlement(owner: Player) extends Building(owner) with Vertex {

  /** The cost of resources of the building. */
  override protected val cost: Map[String, Int] =
    Map("Brick" -> 1, "Grain" -> 1, "Lumber" -> 1, "Wool" -> 1)

  /** True if the building is upgradable, false otherwise. */
  override protected val upgradable: Boolean = true

  override def getVictoryPoints: Int = 1

  override def getObtainableResources: Int = 1
}
