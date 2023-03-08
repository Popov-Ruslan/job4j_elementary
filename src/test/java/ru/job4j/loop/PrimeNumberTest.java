package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {
    @Test
    public void whenCount5Then2() {
        int in = 5;
        int rst = PrimeNumber.calc(in);
        int expected = 3;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenCount0Then0() {
        int in = 0;
        int rst = PrimeNumber.calc(in);
        int expected = 0;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenCount1Then0() {
        int in = 1;
        int rst = PrimeNumber.calc(in);
        int expected = 0;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenCount11Then5() {
        int in = 11;
        int rst = PrimeNumber.calc(in);
        int expected = 5;
        assertThat(rst).isEqualTo(expected);
    }
}