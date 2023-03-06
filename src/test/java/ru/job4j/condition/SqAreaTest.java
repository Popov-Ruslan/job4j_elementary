package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double result = SqArea.square(p, k);
        double expected = 2;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenP4K1Then1() {
        double p = 4;
        double k = 1;
        double result = SqArea.square(p, k);
        double expected = 1;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenP30K4Then36() {
        double p = 30;
        double k = 4;
        double result = SqArea.square(p, k);
        double expected = 36;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }
}