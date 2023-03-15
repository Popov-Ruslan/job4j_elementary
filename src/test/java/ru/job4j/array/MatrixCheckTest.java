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
}