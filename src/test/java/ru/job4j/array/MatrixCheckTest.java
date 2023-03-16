package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean rst = MatrixCheck.monoHorizontal(board, row);
        assertThat(rst).isTrue();
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        char[][] board = {
                {'X', 'X', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 0;
        boolean rst = MatrixCheck.monoHorizontal(board, row);
        assertThat(rst).isFalse();
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] board = {
                {'X', 'X', ' '},
                {'X', ' ', ' '},
                {'X', ' ', 'X'}
        };
        int column = 0;
        boolean rst = MatrixCheck.monoVertical(board, column);
        assertThat(rst).isTrue();
    }

    @Test
    public void whenHasNotMonoVertical() {
        char[][] board = {
                {'X', 'X', ' '},
                {' ', ' ', ' '},
                {'x', 'X', 'X'}
        };
        int column = 0;
        boolean rst = MatrixCheck.monoVertical(board, column);
        assertThat(rst).isFalse();
    }

    @Test
    public void whenDiagonalFullX() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] rst = MatrixCheck.extractDiagonal(board);
        char[] expected = {'X', 'X', 'X'};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] board = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'}
        };
        char[] rst = MatrixCheck.extractDiagonal(board);
        char[] expected = {'1', '1', '1'};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenDiagonalmix() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'}
        };
        char[] rst = MatrixCheck.extractDiagonal(board);
        char[] expected = {'X', 'Y', 'Z'};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenDataVerticalMonoThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},

        };
        boolean rst = MatrixCheck.isWin(input);
        assertThat(rst).isTrue();
    }

    @Test
    public void whenDataNotMonoThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},

        };
        boolean rst = MatrixCheck.isWin(input);
        assertThat(rst).isFalse();
    }

    @Test
    public void whenDataHorizontalMonoThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},

        };
        boolean rst = MatrixCheck.isWin(input);
        assertThat(rst).isTrue();
    }

    @Test
    public void whenDataDiagonalMonoThenFalse() {
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X'},

        };
        boolean rst = MatrixCheck.isWin(input);
        assertThat(rst).isFalse();
    }
}