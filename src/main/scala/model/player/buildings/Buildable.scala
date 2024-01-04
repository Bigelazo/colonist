package model.player.buildings

import model.player.Player

/**
 * Interface that represents a building structure. A building is a structure that can be placed on
 * the board. It has a cost of resources, an owner, and it can be upgraded or not.
 */
trait Buildable {

    /** Gets the cost of resources of the building. */
    def getCost: Map[String, Int]

    /** Returns a copy of the owner of the building. */
    def getOwner: Player

    /** Returns true if the building is upgradable, false otherwise. */
    def isUpgradable: Boolean

    /** Returns true if the building is placed on the board, false otherwise. */
    def isPlacedOnBoard: Boolean
}
