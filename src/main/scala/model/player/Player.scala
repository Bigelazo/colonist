package model.player

import scala.collection.mutable

/**
 * A player in the game. A player has a name, a color, a victory points counter, a predefined number
 * of settlements, cities and roads, a hand of resource cards and a hand of development cards, and
 * a road counter and an army counter. A player can also have the longest road and the largest army.
 *
 * @constructor Creates a new player with the specified name and color, and initializes the victory
 *              points counter, the number of settlements, cities and roads, and the hands of
 *              resource and development cards. The road counter and the army counter are set to 0,
 *              and the longest road and the largest army are set to false.
 * @param name The name of the player.
 * @param color The color of the player.
 * @example {{{
 * val player = new Player("Player 1", "Blue")
 * Creates a new player with the name "Player 1" and the color "Blue", and initializes the victory
 * points counter to 0, sets 5 settlements, 4 cities and 15 roads, and the empty hands of resource
 * and development cards, and sets the road counter and the army counter to 0, and the longest road
 * and the largest army to false.
 * }}}
 *
 */
class Player(val name: String,
             val color: String) {

  /** The victory points counter of the player. */
  private var victoryPoints: Int = 0

  /** Gets the number of victory points of the player. */
  def getVictoryPoints: Int = victoryPoints

  /** The number of settlements of the player. */
  private var settlements: Int = 5

  /** Gets the number of settlements of the player. */
  def getSettlements: Int = settlements

  /** The number of cities of the player. */
  private var cities: Int = 4

  /** Gets the number of cities of the player. */
  def getCities: Int = cities

  /** The number of roads of the player. */
  private var roads: Int = 15

  /** Gets the number of roads of the player. */
  def getRoads: Int = roads

  /** The hand of resource cards of the player. */
  private val resourceCards: mutable.Map[String, Int] =
    mutable.Map("Brick" -> 0, "Grain" -> 0, "Lumber" -> 0, "Ore" -> 0, "Wool" -> 0)

  /** Gets a copy of the hand of resource cards of the player. */
  def getResourceCards: mutable.Map[String, Int] = mutable.Map() ++ resourceCards

  /** The hand of development cards of the player. */
  private val developmentCards: Map[String, Int] =
    Map("Knight" -> 0, "Victory Point" -> 0, "Road Building" -> 0, "Year of Plenty" -> 0, "Monopoly" -> 0)

  /** Gets a copy of the hand of development cards of the player. */
  def getDevelopmentCards: mutable.Map[String, Int] = mutable.Map() ++ developmentCards

  /** The number of roads placed by the player. */
  private var placedRoads: Int = 0

  /** Gets the number of roads placed by the player. */
  def getPlacedRoads: Int = placedRoads

  /** The number of knights played by the player. */
  private var army: Int = 0

  /** Gets the number of knights played by the player. */
  def getArmy: Int = army

  /** Whether the player has the longest road. */
  private var longestRoad: Boolean = false

  /** Gets whether the player has the longest road. */
  def hasLongestRoad: Boolean = longestRoad

  /** Whether the player has the largest army. */
  private var largestArmy: Boolean = false

  /** Gets whether the player has the largest army. */
  def hasLargestArmy: Boolean = largestArmy

}
