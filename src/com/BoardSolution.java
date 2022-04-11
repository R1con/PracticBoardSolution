package com;

public class BoardSolution {

    public static boolean checkValidValue(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < 1 && array[j] > 9)
                    return false;

                if (array[i] != -1 && array[j] != -1) {
                    if (array[i] == array[j]) {
                        System.out.println("element duplicate = " + array[i]);
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static boolean isValidBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            int[] arrayRows = new int[9];
            int[] arrayCol = new int[9];
            for (int j = 0; j < board[i].length; j++) {
                if (Character.isLetter(board[i][j]))
                    return false;

                arrayRows[j] = Character.getNumericValue(board[i][j]);
                arrayCol[j] = Character.getNumericValue(board[j][i]);


            }

                if (!checkValidValue(arrayRows) || !checkValidValue(arrayCol)) {
                    System.out.print("Matrix is not valid:" + " ");
                    return false;
                }
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
                {'5', '.', '1', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
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
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidBoard(board1));
    }
}
