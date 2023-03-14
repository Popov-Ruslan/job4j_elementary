package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixSumTest {
    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int rst = MatrixSum.sum(array);
        int expected = 10;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenDouble() {
        int[][] array = {
                {3, 8},
                {13, 3}
        };
        int rst = MatrixSum.sum(array);
        int expected = 27;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {4, 8, 1},
                {13, 3, 5}
        };
        int rst = MatrixSum.sum(array);
        int expected = 34;
        assertThat(rst).isEqualTo(expected);
    }
}