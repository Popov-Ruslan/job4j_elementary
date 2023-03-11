package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class RollBackArrayTest {
    @Test
    public void whenEmpty() {
        int[] array = new int[] {};
        int[] rst = RollBackArray.rollback(array);
        int[] expected = new int[] {};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenOne() {
        int[] array = {1};
        int[] rst = RollBackArray.rollback(array);
        int[] expected = {1};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenFull() {
        int[] array = {3, 5, 8, 13};
        int[] rst = RollBackArray.rollback(array);
        int[] expected = {13, 8, 5, 3};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenSame() {
        int[] array = {3, 3, 3, 3};
        int[] rst = RollBackArray.rollback(array);
        int[] expected = {3, 3, 3, 3};
        assertThat(rst).containsExactly(expected);
    }
}