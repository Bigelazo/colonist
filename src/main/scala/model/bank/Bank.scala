package model.bank

import model.cards.development.{Development, Knight, Monopoly, RoadBuilding, VictoryPoint, YearOfPlenty}
import model.cards.resources.{Brick, Grain, Lumber, Ore, Wool}

import scala.collection.mutable
import scala.util.Random

/**
 * Object that represents the bank of the game. Contains the development and the resource cards of
 * the game. It's used from players to draw development and resource cards and also to receive cards
 * when a player buys a building or development card, or has to discard resources.
 *
 * The bank starts with 19 cards of each resource and a deck of 25 shuffled development cards.
 *
 * It's a singleton object because there's only one bank in the game and it's shared between all
 * players.
 */
object Bank {

  /** The bank deposit of brick resource card. */
  private val brick: mutable.Queue[Brick] = mutable.Queue.fill(19)(new Brick)

  /** Gets the number of brick resource cards in the bank. */
  def getBrickAmount: Int = brick.size

  /** The bank deposit of grain resource card. */
  private val grain: mutable.Queue[Grain] = mutable.Queue.fill(19)(new Grain)

  /** Gets the number of grain resource cards in the bank. */
  def getGrainAmount: Int = grain.size

  /** The bank deposit of lumber resource card. */
  private val lumber: mutable.Queue[Lumber] = mutable.Queue.fill(19)(new Lumber)

  /** Gets the number of lumber resource cards in the bank. */
  def getLumberAmount: Int = lumber.size

  /** The bank deposit of ore resource card. */
  private val ore: mutable.Queue[Ore] = mutable.Queue.fill(19)(new Ore)

  /** Gets the number of ore resource cards in the bank. */
  def getOreAmount: Int = ore.size

  /** The bank deposit of wool resource card. */
  private val wool: mutable.Queue[Wool] = mutable.Queue.fill(19)(new Wool)

  /** Gets the number of wool resource cards in the bank. */
  def getWoolAmount: Int = wool.size

  /** The deck of development cards of the bank. It's shuffled for random draw purposes. */
  private val developmentCardsDeck: mutable.Queue[Development] = Random.shuffle(
    mutable.Queue().enqueueAll(
      collection.IndexedSeq.concat(
        List.fill(14)(new Knight), List.fill(5)(new VictoryPoint),
        List.fill(2)(new RoadBuilding), List.fill(2)(new Monopoly), List.fill(2)(new YearOfPlenty)
      )
    )
  ).to(mutable.Queue)

  /** Gets the number of development cards in the bank. */
  def getDeckSize: Int = developmentCardsDeck.size
}
