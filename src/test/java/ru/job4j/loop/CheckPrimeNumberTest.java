package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {
    @Test
    public void whenCheck0ThenFalse() {
        int in = 0;
        boolean rst = CheckPrimeNumber.check(in);
        assertThat(rst).isFalse();
    }

    @Test
    public void whenCheck1ThenFalse() {
        int in = 1;
        boolean rst = CheckPrimeNumber.check(in);
        assertThat(rst).isFalse();
    }

    @Test
    public void whenCheck14ThenFalse() {
        int in = 14;
        boolean rst = CheckPrimeNumber.check(in);
        assertThat(rst).isFalse();
    }

    @Test
    public void whenCheck11ThenTrue() {
        int in = 11;
        boolean rst = CheckPrimeNumber.check(in);
        assertThat(rst).isTrue();
    }

    @Test
    public void whenCheck37ThenTrue() {
        int in = 37;
        boolean rst = CheckPrimeNumber.check(in);
        assertThat(rst).isTrue();
    }
}