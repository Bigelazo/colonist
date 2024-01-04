package model.player.buildings

import model.player.Player

/**
 * Abstract class that represents a building. A building is a structure that can be placed on the
 * board. It has a cost of resources, an owner, and it can be upgraded. It is abstract because it
 * can't be instantiated.
 *
 * @param owner the owner of the building.
 *
 */
protected abstract class Building(private val owner: Player) extends Buildable {

      /** The cost of resources of the building. */
      protected val cost: Map[String, Int]

      /** True if the building is upgradable, false otherwise. */
      protected val upgradable: Boolean

      /** Gets the cost of resources of the building. */
      def getCost: Map[String, Int] = cost

      /** Returns a copy of the owner of the building. */
      def getOwner: Player = owner

      /** Returns true if the building is upgradable, false otherwise. */
      def isUpgradable: Boolean = upgradable

}
