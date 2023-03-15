package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rst = true;
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 'X') {
                rst = false;
                break;
            }
        }
        return rst;
    }
}
