# Colonist

## Out of the box:

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
    - Idea: Lista enlazada para colocar las fichas en orden
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

## Entidades a implementar:

- [ ] Tablero:
    - [ ] Espacio hexagonal (19 hexágonos juego original)
    - [ ] Recursos:
        - [ ] Aristas
        - [ ] Vértices
    - [ ] Puertos
    - [ ] Desierto
    - [ ] Ladrón

- [ ] Jugador:
    - [ ] Poblados
    - [ ] Ciudades
    - [ ] Carreteras
    - [ ] Puntos de victoria

- [ ] Cartas:
    - [ ] Recursos
    - [ ] Desarrollo

- [ ] Dado

Funcionalidades a implemetar:

- [ ] Fácil:

- [ ] Intermedio:

- [ ] Difícil:

### Desafíos:

- Cómo conchetumadre conecto los hexágonos:
    - Primera idea: Enumerar aristas y vértices del 1 al 6
        - Problema de eso: La arista 1 de un hexágono podría ser otro número de otro hexágono y puede generar problemas para el límite de edificaciones
