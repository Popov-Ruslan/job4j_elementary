package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    public void whenTurn2471Then1742() {
        int[] array = {2, 4, 7, 1};
        int[] rst = Turn.back(array);
        int[] expected = {1, 7, 4, 2};
        assertThat(rst).containsExactly(expected);
    }

    @Test
    public void whenTurn43518Then81534() {
        int[] array = {4, 3, 5, 1, 8};
        int[] rst = Turn.back(array);
        int[] expected = {8, 1, 5, 3, 4};
        assertThat(rst).containsExactly(expected);
    }
}