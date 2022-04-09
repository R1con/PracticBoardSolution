package com;

public class BoardSolution {

    public static boolean checkValidNumber(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                 if (array[i] != -1 && array[j] != -1){
                        if (array[i] == array[j]) {
                            System.out.println("element duplicate = " + array[i]);
                            return false;
                        }
                }
                if (array[i] < 1 || array[i] > 9)
                    return false;
            }
        }

        return true;
    }

    public static boolean isNotDuplicateCharOnRow(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            int[] arrayRows = new int[9];
            for (int j = 0; j < board[i].length; j++) {
                arrayRows[j] = Character.getNumericValue(board[i][j]);
            }

            if(!checkValidNumber(arrayRows)) {
                return false;
            }
        }

        return true; // дубликата в строке нет
    }

    public static boolean isNotDuplicateCharOnCol(char[][] board) {

        for (int j = 0; j < board.length; j++) {
            int[] arrayCols = new int[9];
            for (int i = 0; i < board[j].length; i++) {
                arrayCols[i] = Character.getNumericValue(board[i][j]);
            }

            if(!checkValidNumber(arrayCols)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isValidBoard(char[][] board) {
        boolean flag;
        if (isNotDuplicateCharOnRow(board) && isNotDuplicateCharOnCol(board)) {
            System.out.print("Matrix is valid:" + " ");
            flag = true;
            return flag;
        }

        System.out.print("Matrix is not valid:" + " ");

        return false;
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
                {'5', '.', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] board2 = {
                {'5', 'а', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidBoard(board2));
    }
}
