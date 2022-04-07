package com;

public class BoardSolution {

    public static boolean isDuplicateCharOnRow(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                } else if (board[i][j] >= '1' && board[i][j] <= '9') {
                    for (int k = j + 1; k < board[i].length; k++) {
                        if (board[i][j] == board[i][k]){
                            System.out.println("Повторный элемент найден в строке " + (i + 1) + " \nэлемент = " + board[i][k]);
                            return false;
                        }

                    }
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isDuplicateCharOnCol(char[][] board) {
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[j].length; i++) {
                if (board[j][i] == '.') {
                    continue;
                } else if (board[j][i] >= '1' && board[j][i] <= '9') {
                    for (int k = j + 1; k < board[i].length; k++) {
                        if (board[j][i] == board[k][i]) {
                            System.out.print("Повторный элемент найден в столбце " + (j + 1));
                            System.out.println("элемент = " + board[j][i]);
                            return false;
                        }

                    }
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidBoard(char[][] board) {
        boolean flag = false;
        if (isDuplicateCharOnRow(board) && isDuplicateCharOnCol(board)) {
            System.out.print("Matrix is valid:" + " ");
            flag = true;
        } else {
            System.out.print("Matrix is not valid:" + " ");
        }

        return flag;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '.', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] board1 = {
                {'5', '.', '.', '.', '4', '.', '.', '2', '.'},
                {'5', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', ',', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '5', '.', '7', '9'}};

        char[][] board2 = {
                {'5', '.', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '.', '.', '.', '8', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'.', '.', '2', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'7', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isDuplicateCharOnRow(board1));
    }
}
