package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] array = {1, 2, 3, 4};
        int source = 0;
        int dest = 3;
        int[] rst = SwitchArray.swap(array, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenSwap3to5() {
        int[] array = {3, 8, 1, 3, 5, 10, 4, 9};
        int source = 3;
        int dest = 5;
        int[] rst = SwitchArray.swap(array, source, dest);
        int[] expected = {3, 8, 1, 10, 5, 3, 4, 9};
        assertThat(rst).containsExactly(expected);
    }
}