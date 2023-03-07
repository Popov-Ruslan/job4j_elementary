package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    public void whenSumFrom0toFiveThen15() {
        int start = 0;
        int finish = 5;
        int rst = Counter.sum(start, finish);
        int expected = 15;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int rst = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenEvenNumbersFrom3to7Then10() {
        int start = 3;
        int finish = 7;
        int rst = Counter.sumByEven(start, finish);
        int expected = 10;
        assertThat(rst).isEqualTo(expected);
    }
}