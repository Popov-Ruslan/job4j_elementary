package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expected = {0, 1, 4};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expected = {0, 1, 4, 9, 16};
        assertThat(rst).containsExactly(expected);
    }
}