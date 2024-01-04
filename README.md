# Colonist

[Colonist](https://colonist.io) is an online board game based on the popular game Catan. The game is
played by 3 or 4 players, each one with the objective of being the first to reach 10 victory points.
The game is played on a board composed of hexagonal tiles, each one representing a terrain type.
Each terrain type produces a resource, and the players can build settlements and cities on the
vertices of the tiles to collect the resources. The players can also build roads on the edges of the
tiles to connect their settlements and cities. The players can trade resources with each other, and
they can also trade with the bank. The players can also buy development cards, which can give them
victory points or special abilities. The players can also build the longest road and the largest
army, which give them extra victory points.

The purpose of this project is to create a simple recreation of the game Colonist that allows the
players to play the game, using good practices of software development. The application will be
developed using the programming language Scala, various design patterns, and it will be based on the
MVC architecture and test-driven development, using the MUnit library.

## Out of the box:

The elements that come with the original board game are the following:

9 Harbor chits:
- 1 2:1 Lumber
- 1 2:1 Wool
- 1 2:1 Wheat
- 1 2:1 Brick
- 1 2:1 Ore
- 4 3:1 Any

Number chits:
- 1 '2' | 2 '3'
- 2 '4' | 2 '5'
- 2 '6' | 2 '8'
- 2 '9' | 2 '10'
- 2 '11'| 1 '12'
- Idea: Linked list to place the chits in order. The numbers are placed in the following order:
  - A-5, B-2, C-6, D-3, E-8, F-10, G-9, H-12, I-11, J-4, K-8, L-10, M-9, N-4, O-5, P-6, Q-3, R-11

95 Resource cards:
- 19 Lumber
- 19 Wool
- 19 Grain
- 19 Brick
- 19 Ore

25 Development cards:
- 14 Knight
- 5 Victory Point
- 2 Year of Plenty
- 2 Monopoly
- 2 Road Building

2 Special Victory Point cards:
- Longest Road
- Largest Army

19 Terrain hexes:
- 4 Forest
- 4 Pasture
- 4 Field
- 3 Hill
- 3 Mountain
- 1 Desert

Player pieces:
- 5 Settlement
- 4 City
- 15 Road

## Entities to implement:

- [ ] Board:
    - [ ] Hexagonal space (19 tiles original game)
    - [ ] Resources:
        - [ ] Edges
        - [ ] Vertices
    - [ ] Ports
    - [ ] Desert
    - [ ] Robber

- [x] Player:
    - [x] Settlements
    - [x] Cities
    - [x] Roads
    - [x] Victory points

- [ ] Cards:
    - [ ] Resource cards
    - [ ] Development cards
    - [ ] Victory point cards

- [ ] Bank:
    - [ ] Resource cards
    - [ ] Development cards
    - [ ] Victory point cards

## Functionalities to implement:

- [ ] Initialization:
    - [ ] Place the hexagons
    - [ ] Place the numbers
    - [ ] Place the ports
    - [ ] Place the robber
    - [ ] Place the settlements
    - [ ] Place the roads
    - [ ] Deal resource cards

- [ ] Turn:
    - [ ] Throw dice
    - [ ] Draw cards:
      - [ ] Steal from a player
      - [ ] Draw from the bank
    - [ ] Trade:
      - [ ] With the bank
      - [ ] With other players:
        - [ ] Offer
        - [ ] Counteroffer
      - [ ] With the port
    - [ ] Build
    - [ ] Buy development card
    - [ ] Use development card
    - [ ] Pass turn

- [ ] End game:
  - [ ] Check victory points
  - [ ] Declare winner
  - [ ] Restart game

## Design patterns to implement:

- [ ] Singleton: for the bank to be unique.

- [ ] Factory: for the cards to be created by the bank and given to the players.

- [ ] State: for the game flow to be controlled by the state of the game.

- [ ] Observer: for the players to observe the board and take resources from it when the dice are
  thrown and the number of the hexagon matches the number thrown. Also, to check if a player has 
  reached 10 victory points and won the game.

- [ ] Builder: for the board to be built in a step-by-step process.