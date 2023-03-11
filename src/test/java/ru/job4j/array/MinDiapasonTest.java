package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MinDiapasonTest {
    @Test
    public void whenLastMinInDiapason() {
        int[] array = {35, 13, 1, 88, -1};
        int rst = MinDiapason.findMin(array, 2, 4);
        int expected = -1;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenMidMinInDiapason() {
        int[] array = {35, 13, -11, 88, -1};
        int rst = MinDiapason.findMin(array, 2, 4);
        int expected = -11;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenFirstMinInDiapason() {
        int[] array = {-35, 13, 1, 88, -1};
        int rst = MinDiapason.findMin(array, 0, 3);
        int expected = -35;
        assertThat(rst).isEqualTo(expected);
    }
}