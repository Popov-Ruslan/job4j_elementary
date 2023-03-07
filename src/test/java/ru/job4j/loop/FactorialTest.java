package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    public void whenFact3Then6() {
        int input = 3;
        int rst = Factorial.calc(input);
        int expected = 6;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenFact0Then1() {
        int input = 0;
        int rst = Factorial.calc(input);
        int expected = 1;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenFact1Then1() {
        int input = 1;
        int rst = Factorial.calc(input);
        int expected = 1;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenFact7Then5040() {
        int input = 7;
        int rst = Factorial.calc(input);
        int expected = 5040;
        assertThat(rst).isEqualTo(expected);
    }

}