package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TwoNumberSumTest {
    @Test
    public void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] rst = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 1};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenTwoEqualNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] rst = TwoNumberSum.getIndexes(array, target);
        int[] expected = new int[0];
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] rst = TwoNumberSum.getIndexes(array, target);
        int[] expected = {1, 4};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] rst = TwoNumberSum.getIndexes(array, target);
        int[] expected = {2, 4};
        assertThat(rst).containsExactly(expected);
    }
}