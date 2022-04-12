package com;

import java.util.HashSet;
import java.util.Set;

class BoardSolution {

    private boolean isNotDuplicateOnRow(char[][] board) {

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

    private boolean isNotDuplicateOnCol(char[][] board) {

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

    public boolean isValidBoardWithHashSet(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            Set<Integer> colSet = new HashSet<>();
            Set<Integer> rowSet = new HashSet<>();
            for (int column = 0; column < board[row].length; column++) {
                if (board[column][row] != '.' && !colSet.add(Character.digit(board[column][row], 10))
                        || board[row][column] != '.' && !rowSet.add(Character.digit(board[row][column], 10))) {
                    System.out.print("Matrix is not valid: ");
                    return false;
                }

            }
        }

        System.out.print("Matrix is  valid: ");
        return true;
    }

    public boolean isValidBoardWithArray(char[][] board) {

        boolean flag;
        if (!isNotDuplicateOnRow(board) || !isNotDuplicateOnCol(board)) {
            System.out.print("Matrix is  not valid:" + " ");
            flag = false;
            return flag;
        }

        System.out.print("Matrix is  valid:" + " ");
        return true;
    }
}
