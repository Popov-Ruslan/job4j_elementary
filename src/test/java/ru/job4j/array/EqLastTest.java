package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqLastTest {
    @Test
    public void whenCheck213And123ThenTrue() {
        int[] left = {2, 1, 3};
        int[] right = {1, 2, 3};
        boolean rst = EqLast.check(left, right);
        assertThat(rst).isTrue();
    }

    @Test
    public void whenCheck213And314ThenFalse() {
        int[] left = {2, 1, 3};
        int[] right = {3, 1, 4};
        boolean rst = EqLast.check(left, right);
        assertThat(rst).isFalse();
    }
}