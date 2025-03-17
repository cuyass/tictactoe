package com.tictactoe;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        byte n = 3;

        char[][] board = new char[n][n];
        for(byte i = 0; i < n; i++){
            for(byte j = 0; j < n; j++){
                board[i][j] = '-';
            }
        }
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("¡Hola! ¿Estáis a punto para jugar? Porque yo sí\n");
    System.out.println("Primero, se debe numerar las filas verticales del 0 al 2, siendo 0 la fila superior y 2 la fila inferior. Luego, se debe numerar las columnas horizontales del 0 al 2, donde 0 corresponde al lado izquierdo y 2 al lado derecho.");
    boolean player1 = true;


    boolean gameEnded = false;
    while (!gameEnded) {

            drawBoard(board);
        
            if (player1) {
                System.out.println("\nEs el turno de X:\n");
            } else {
                System.out.println("\nEs el turno de O:\n");
            }
            
            
            char c = '-';
            if(player1) {
                c = 'X';
            } else {
                c = 'O';
            } 

            byte row = 0;
            byte col = 0;
          
            while(true) {
                boolean continua;
                do {
                    try {
                        continua = false;
                        System.out.print("Escribe tu posición indicando la fila: ");
                        row = scanner.nextByte();
                    } catch (InputMismatchException e) {
                        System.out.println("Ingresa solamente los números indicados");
                        scanner.next();
                        continua = true;
                    }  
                } while (continua);

                do {
                    try {
                        continua = false;
                        System.out.print("Escribe tu posición indicando la columna: ");
                        col = scanner.nextByte();
                    } catch (InputMismatchException ex) {
                        System.out.println("Ingresa solamente los números indicados");
                        scanner.next();
                        continua = true;
                    }
                } while (continua);
                    
                

                if (row < 0 || col < 0 || row >= n || col >= n){
                    System.out.println("Te has ido del tablero, prueba otra vez");
                } else if ( board[row][col] != '-') {
                    System.out.println("Esta ocupado ya, prueba otra vez");
                } else { 
                break;
                }
            }
            board[row][col] = c;
            if(playerHasWon(board) == 'X') {
                System.out.println("\nJugador X ha ganado!\n");
                gameEnded = true;
            } else if (playerHasWon(board) == 'O') {
                System.out.println("\nJugador O ha ganado!\n");
                gameEnded = true;
            } else {
                if (boardIsFull(board)) {
                    System.out.println("\nEs un empate!\n");
                    gameEnded = true;
                } else {
                    player1 = !player1;
                }
            }
        }
        
        drawBoard(board);

        
    scanner.close();
    }

    public static void drawBoard(char[][]board){
        
        System.out.println("\n\tTablero:\n");
        for( byte i = 0; i < board.length; i ++) {
            for (byte j = 0; j < board[i].length; j++) {
                System.out.print("\t" + board [i][j]);
            }
        System.out.println();
        }
    }

    public static char playerHasWon(char[][] board) {

        for(byte i = 0; i < board.length; i++){
            boolean inARow = true;
            char value = board[i][0];
            if(value == '-'){
                inARow = false;
            } else {
                for(byte j = 1; j < board[i].length; j++) {
                    if(board[i][j] != value){
                    inARow = false;
                    break;
                    }
                }
            }
            
            if(inARow){
                return value;
            }
        }


        for(byte j = 0; j < board[0].length; j++){
            boolean inACol = true;
            char value = board[0][j];
            if(value == '-'){
                inACol = false;
            } else {
                for(byte i = 1; i < board.length; i++){
                    if(board[i][j] != value){
                        inACol = false;
                        break;
                    }
                }
            }

            if(inACol) {
                return value;
            }
        }
        
        
        boolean inADiag1 = true;
        char value1 = board[0][0];
        if(value1 == '-') {
            inADiag1 = false;
        } else {
            for(byte i = 1; i < board.length; i++){
                if(board[i][i] != value1){
                    inADiag1 = false;
                    break;
                }
            }
        }

        if(inADiag1){
            return value1;
        }   


        boolean inADiag2 = true;
        char value2 = board[0][board.length-1];
        if(value2 == '-'){
            inADiag2 = false;
        } else {
            for(byte i = 1; i < board.length; i++){
                if(board[i][board.length-1] != value2) {
                    inADiag2 = false;
                    break;
                }
            }
        }
            
        if(inADiag2){
            return value2;
        }

        return ' ';
    }

    public static boolean boardIsFull(char[][]board) {
        for(byte i = 0; i < board.length; i++) {
            for(byte j = 0; j < board[i].length; j++) {
                if(board [i][j] == '-') {
                    return false;
                }
            }
        }

        return true;  
    }
}
