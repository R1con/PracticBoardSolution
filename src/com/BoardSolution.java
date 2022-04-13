package com;

import java.util.HashSet;
import java.util.Set;

class BoardSolution {

    public boolean isValidBoardWithHashSet(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            Set<Character> colSet = new HashSet<>();
            Set<Character> rowSet = new HashSet<>();
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column] != '.' && board[row][column] < '1' | board[row][column] > '9' | !rowSet.add(board[row][column])) {
                    System.out.print("Matrix is not valid");
                    return false;
                }
                if (board[column][row] != '.' && board[column][row] < '1' | board[column][row] > '9' | !colSet.add(board[column][row])) {
                    System.out.print("Matrix is not valid");
                    return false;
                }
            }
        }

        System.out.print("Matrix is  valid");
        return true;
    }
}
