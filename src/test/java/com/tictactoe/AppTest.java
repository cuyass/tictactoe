package com.tictactoe;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AppTest 
{

    @Test
    public void testBoardIsFull_shouldReturnTrue(){

        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'O', 'X'},
            {'X', 'X', 'O'}
        };
        assertTrue(App.boardIsFull(board));
    }
    
    @Test
    public void testBoardIsNotFull_shouldReturnFalse(){

        char[][] board = {
            {'-', 'O', 'X'},
            {'O', 'O', 'X'},
            {'X', 'X', 'O'}
        };
        assertFalse(App.boardIsFull(board));
    }

    @Test 
    public void testPlayerHasWon_row(){

        char[][] board = {
            {'-', 'O', 'O'},
            {'O', '-', 'X'},
            {'X', 'X', 'X'}
        };
        assertEquals('X', App.playerHasWon(board));
    }

    @Test 
    public void testPlayerHasWon_column(){

        char[][] board = {
            {'-', 'O', '-'},
            {'-', 'O', 'X'},
            {'X', 'O', 'X'}
        };
        assertEquals('O', App.playerHasWon(board));
    }
   
}
