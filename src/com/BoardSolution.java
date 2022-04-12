package com;

import java.util.HashSet;
import java.util.Set;

public class BoardSolution {

    public static boolean isNotDuplicateOnRow(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            boolean[] setElementRow = new boolean[9];
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] >= '1' && board[i][j] <= '9') {
                    if (setElementRow[Character.digit(board[i][j], 10) - 1]) {
                        System.out.println("Duplicate on row = " + (i + 1) + ", element = " + board[i][j]);
                        return false;
                    } else {
                        setElementRow[Character.digit(board[i][j], 10) - 1] = true;
                    }
                } else if (board[i][j] != '.') {
                    System.out.println("Not valid symbol = " + board[i][j] + ", in row = " + (i + 1));
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isNotDuplicateOnCol(char[][] board) {

        for (int j = 0; j < board.length; j++) {
            boolean[] setElementCol = new boolean[9];
            for (int i = 0; i < board[j].length; i++) {
                if (board[i][j] >= '1' && board[i][j] <= '9') {
                    if (setElementCol[Character.digit(board[i][j], 10) - 1]) {
                        System.out.println("Duplicate on col = " + (j + 1) + ", element = " + board[i][j]);
                        return false;
                    } else {
                        setElementCol[Character.digit(board[i][j], 10) - 1] = true;
                    }
                } else if (board[i][j] != '.') {
                    System.out.println("Not valid symbol = " + board[i][j] + ", in col = " + j);
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidBoardWithHashSet(char[][] board) {

        for (char[] i : board) {
            Set<Integer> rowSet = new HashSet<>();
            for (char j : i) {
                if (j != '.' && rowSet.contains(Character.digit(j, 10))) {
                        System.out.print("Matrix is not valid: ");
                        return false;
                    }
                    rowSet.add(Character.digit(j, 10));
                }
            }

        //Set<Integer> colSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            Set<Integer> colSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    int value = board[j][i];
                    if (colSet.contains(value)) {
                        System.out.print("Matrix is not valid: ");
                        return false;
                    }
                    colSet.add(value);
                }
            }
        }

        System.out.print("Matrix is  valid: ");
        return true;
    }


    public static boolean isValidBoard(char[][] board) {

        if (!isNotDuplicateOnRow(board) || !isNotDuplicateOnCol(board)) {
            System.out.print("Matrix is  not valid:" + " ");
            return false;
        }

        System.out.print("Matrix is  valid:" + " ");
        return true;
    }


    public static void main(String[] args) {

        char[][] board = {
                {'5', '.', '1', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] board1 = {
                {'5', '.', '1', '.', '7', '.', '5', '.', '.'},
                {'.', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '6', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '.', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] board2 = {
                {'5', '.', '1', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'7', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidBoardWithHashSet(board2));
    }
}
