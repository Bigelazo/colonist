package model.player.buildings.vertex

import model.player.Player

/**
 * Represents a city. A city is a vertex building that can be placed on the board.
 * It has a cost of resources, an owner, and it cannot be upgraded.
 *
 * @constructor creates a new city owned by the specified player, with a cost of 2 Grain and 3 Ore.
 *              The city is not upgradable.
 * @param owner the owner of the city.
 * @example {{{
 *          val owner: Player = new Player("Player 1", "Blue")
 *          val city: City = new City(owner)
 *          Creates a city owned by "Player 1", with the a cost of 2 Grain and 3 Ore. The city is
 *          not upgradable.
 * }}}
 */
class City(owner: Player) extends Settlement(owner) {

  /** The cost of resources of the building. */
  override protected val cost: Map[String, Int] = Map("Grain" -> 2, "Ore" -> 3)

  /** True if the building is upgradable, false otherwise. */
  override protected val upgradable: Boolean = false

  override def getVictoryPoints: Int = 2

  override def getObtainableResources: Int = 2
}
