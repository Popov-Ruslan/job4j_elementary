package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    public void whenContains() {
        int[] data = {3, 8, 13, 2};
        int el = 8;
        int rst = FindLoop.indexOf(data, el);
        int expected = 1;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenNotContains() {
        int[] data = {3, 8, 13, 2};
        int el = 10;
        int rst = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenNotContainsInRange() {
        int[] data = {3, 7, 9, 13, 16, 1};
        int el = 7;
        int rst = FindLoop.indexInRange(data, el, 2, 5);
        int expected = -1;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenContainsInRange() {
        int[] data = {3, 7, 9, 13, 16, 1};
        int el = 13;
        int rst = FindLoop.indexInRange(data, el, 3, 5);
        int expected = 3;
        assertThat(rst).isEqualTo(expected);
    }
}