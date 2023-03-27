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

    @Test
    public void whenA3B10C1Then10() {
        int a = 3;
        int b = 10;
        int c = 1;
        int rst = Max.max(a, b, c);
        int expected = 10;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenA1B4C5Then5() {
        int a = 1;
        int b = 4;
        int c = 5;
        int rst = Max.max(a, b, c);
        int expected = 5;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenA8B2C4D0Then8() {
        int a = 8;
        int b = 2;
        int c = 4;
        int d = 0;
        int rst = Max.max(a, b, c, d);
        int expected = 8;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenA2B0C4D7Then7() {
        int a = 2;
        int b = 0;
        int c = 4;
        int d = 7;
        int rst = Max.max(a, b, c, d);
        int expected = 7;
        assertThat(rst).isEqualTo(expected);
    }
}