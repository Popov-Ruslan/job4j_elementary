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
}