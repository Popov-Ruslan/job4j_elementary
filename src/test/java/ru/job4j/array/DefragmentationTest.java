package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DefragmentationTest {
    @Test
    public void whenOneFirst0() {
        int[] array = {0, 1};
        int[] rst = Defragmentation.compress(array);
        int[] expected = {1, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenEmptyArray() {
        int[] array = {};
        int[] rst = Defragmentation.compress(array);
        int[] expected = {};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] rst = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] rst = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenFirstAndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] rst = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenAll0() {
        int[] array = {0, 0, 0, 0};
        int[] rst = Defragmentation.compress(array);
        int[] expected = {0, 0, 0, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] rst = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] rst = Defragmentation.compress(array);
        int[] expected = {1, 2, 3, 4};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void when2PointOneFirst0() {
        int[] array = {0, 1};
        int[] rst = Defragmentation.compress2Point(array);
        int[] expected = {1, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void when2PointEmptyArray() {
        int[] array = {};
        int[] rst = Defragmentation.compress2Point(array);
        int[] expected = {};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void when2PointNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] rst = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void when2PointFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] rst = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void when2PointFirstAndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] rst = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void when2PointAll0() {
        int[] array = {0, 0, 0, 0};
        int[] rst = Defragmentation.compress2Point(array);
        int[] expected = {0, 0, 0, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void when2PointSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] rst = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void when2PointNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] rst = Defragmentation.compress2Point(array);
        int[] expected = {1, 2, 3, 4};
        assertThat(rst).containsExactly(expected);
    }
}