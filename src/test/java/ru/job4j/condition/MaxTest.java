package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenAmoreThanBThenA() {
        int a = 3;
        int b = 2;
        int rst = Max.max(a, b);
        int expected = 3;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenBmoreThanAThenB() {
        int a = 7;
        int b = 10;
        int rsl = Max.max(a, b);
        int expected = 10;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenAEqualsBThenB() {
        int a = 3;
        int b = 3;
        int rsl = Max.max(a, b);
        int expected = 3;
        assertThat(rsl).isEqualTo(expected);
    }
}