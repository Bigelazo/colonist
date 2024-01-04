package model.player.buildings.edge

import model.player.Player
import model.player.buildings.Building

/**
 * Class that represents a road. A road is an edge building that can be placed on the board.
 * It has a cost of resources, an owner, and it cannot be upgraded.
 *
 * @constructor creates a new road owned by the specified player, with a cost of 1 Brick and 1
 *              Lumber. The road is not upgradable.
 * @param owner the owner of the road.
 * @example {{{
 *          val owner: Player = new Player("Player 1", "Blue")
 *          val road: Road = new Road(owner)
 *          Creates a road owned by "Player 1", with the a cost of 1 Brick and 1 Lumber. The road is
 *          not upgradable.
 * }}}
 */
class Road(owner: Player) extends Building(owner) with Edge {

  /** The cost of resources of the building. */
  override protected val cost: Map[String, Int] = Map("Brick" -> 1, "Lumber" -> 1)

  /** True if the building is upgradable, false otherwise. */
  override protected val upgradable: Boolean = false
}
