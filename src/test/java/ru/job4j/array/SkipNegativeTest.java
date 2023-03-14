package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SkipNegativeTest {
    @Test
    public void whenArrayAndColumnEquals() {
        int[][] array = {
                {3, -4},
                {2, 9}
        };
        int[][] rst = SkipNegative.skip(array);
        int[][] expected = {
                {3, 0},
                {2, 9}
        };
        assertThat(rst).isDeepEqualTo(expected);
    }

    @Test
    public void whenArrayRow4AndColumnNotEquals() {
        int[][] array = {
                {1, 0},
                {-2, 3, -2},
                {9, 2, -4, 1},
                {9, 1, 3, -7, -5}
        };
        int[][] rst = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {0, 3, 0},
                {9, 2, 0, 1},
                {9, 1, 3, 0, 0}
        };
        assertThat(rst).isDeepEqualTo(expected);
    }
}