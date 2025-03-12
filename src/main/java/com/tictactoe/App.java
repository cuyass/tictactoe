package com.tictactoe;
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
    System.out.println("¡Hola! ¿Estás a punto para jugar? Porque yo sí");
    drawBoard(board);

    boolean player1 = true;
    boolean gameEndend = false;
        while (gameEndend) {
            drawBoard(board);
            if (player1) {
                System.out.println("Es el turno de X:");
            } else {
                System.out.println("Es el turno de O:");

            }
        }


        
    scanner.close();
    }

    public static void drawBoard(char[][]board){
        System.out.println("\tTablero:");
        for( byte i = 0; i < board.length; i ++) {
            for (byte j = 0; j < board.length; j++) {
                System.out.print("\t" + board [i] [j]);
            }
            System.out.println();
        }


    }

    public static char playerHasWon(char[][]board){
        for(int i = 0; i < board.length; i++){
            boolean inARow = true;
            char value = board[i][0];
            if(value == '-'){
                inARow = false;
            } else {
                for(int j = 1; j < board[i].length; j++)
            if(board[i][j] != value){
                inARow = false;
                break;
            }}
            if(inARow){
                return value;
            }
        }
        for(int j = 0; j < board[0].length; j++){
            boolean inACol = true;
            char value = board[0][j];
            if(value == '-'){
                inACol = false;
            } else {
                for(int i = 1; i < board.length; i++)
            if(board[i][j] != value){
                inACol = false;
                break;
            }}
            if(inACol){
                return value;
            }
        } 
    }
}
