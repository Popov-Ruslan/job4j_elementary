package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MinTest {
    @Test
    public void whenLastMin() {
        int[] array = new int[]{3, 1, 10, -14};
        int rst = Min.findMin(array);
        int expected = -14;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 8, 33};
        int rst = Min.findMin(array);
        int expected = 8;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenFirstMin() {
        int[] array = {-2, -1, 9};
        int rst = Min.findMin(array);
        int expected = -2;
        assertThat(rst).isEqualTo(expected);
    }

}