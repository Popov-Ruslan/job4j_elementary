package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeMaxTest {
    @Test
    public void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int rst = ThreeMax.max(first, second, third);
        int expected = 10;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void secondMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int rst = ThreeMax.max(first, second, third);
        int expected = 50;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void thirdMax() {
        int first = 1;
        int second = 5;
        int third = 100;
        int rst = ThreeMax.max(first, second, third);
        int expected = 100;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int rst = ThreeMax.max(first, second, third);
        int expected = 1;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 1;
        int rst = ThreeMax.max(first, second, third);
        int expected = 10;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void firstEqThird() {
        int first = 10;
        int second = 1;
        int third = 10;
        int rst = ThreeMax.max(first, second, third);
        int expected = 10;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void secondEqThird() {
        int first = 1;
        int second = 10;
        int third = 10;
        int rst = ThreeMax.max(first, second, third);
        int expected = 10;
        assertThat(rst).isEqualTo(expected);
    }
}