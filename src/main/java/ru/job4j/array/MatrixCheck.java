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

    public static boolean monoVertical(char[][] board, int column) {
        boolean rst = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                rst = false;
                break;
            }
        }
        return rst;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rst = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rst[i] = board[i][i];
        }
        return rst;
    }

    public static boolean isWin(char[][] board) {
        boolean rst = false;
        for (int i = 0; i < board.length; i++) {
            char[] diagValues = extractDiagonal(board);
            if (diagValues[i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    rst = true;
                    break;
                }
            }
        }
        return rst;
    }

    public static boolean isWin2(char[][] board) {
        boolean rst = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    rst = true;
                    break;
                }
            }
        }
        return rst;
    }
}
