
# Juego de Tic Tac Toe

Este es un mini juego de Tic Tac Toe en la línea de comandos, implementado en Java. El juego permite que dos jugadores jueguen uno contra el otro.

## Tecnologías usadas

Java v. 21
Maven v. 1.4
Junit Jupiter v. 5.11.4

## Cómo Jugar

1. El tablero del juego es una cuadrícula de 3x3.
2. Los jugadores se turnan para colocar su marcador ('X' o 'O') en el tablero, primero 'X' y luego 'O'.
3. Para hacer un movimiento, ingresa el número de fila y despues el numero de columna del 0 al 2, siendo 0 arriba e izquierda y 2 abajo y derecha cuando se le solicite.
4. El juego termina cuando un jugador logra poner tres de sus marcadores en una fila, columna o diagonal, o cuando el tablero está lleno, lo que resulta en un empate.

## Ejecutar el Juego

Para ejecutar el juego, haz click en 'Run java' en la esquina derecha superior de la pantalla

## Funciones del Juego

- `drawBoard(char[][] board)`: Imprime el estado actual del tablero de juego.
- `playerHasWon(char[][] board)`: Verifica si algún jugador ha ganado el juego.
- `boardIsFull(char[][] board)`: Verifica si el tablero de juego está lleno.
- `main(String[] args)`: La función principal que maneja el bucle del juego.

## Ejemplo

```
¡Hola! ¿Estáis a punto para jugar? Porque yo sí

	Tablero:

	-	-	-
	-	-	-
	-	-	-

Es el turno de X:

Escribe tu posición indicando la fila: 1
Escribe tu posición indicando la columna: 1

	Tablero:

	-	-	-
	-	X	-
	-	-	-

Es el turno de O:

Escribe tu posición indicando la fila: 0
Escribe tu posición indicando la columna: 0

	Tablero:

	O	-	-
	-	X	-
	-	-	-
```

## Autoras

- cuyass
- Femcom-Mari