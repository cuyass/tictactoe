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
}
