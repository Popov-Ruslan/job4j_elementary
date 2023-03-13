package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort4215Then1245() {
        int[] data = {4, 2, 1, 5};
        int[] rst = SortSelected.sort(data);
        int[] expected = {1, 2, 4, 5};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenSort749Then479() {
        int[] data = {7, 4, 9};
        int[] rst = SortSelected.sort(data);
        int[] expected = {4, 7, 9};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenSort18324Then12348() {
        int[] data = {1, 8, 3, 2, 4};
        int[] rst = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 8};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenSort42Then24() {
        int[] data = {4, 2};
        int[] rst = SortSelected.sort(data);
        int[] expected = {2, 4};
        assertThat(rst).containsExactly(expected);
    }

}