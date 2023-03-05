package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DivideBySixTest {
    @Test
    public void whenNumberDividesBy6() {
        int input = 24;
        String rsl = DivideBySix.checkNumber(input);
        String expected = "The number divides by 6";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenNumberDividesBy3AndNotEven() {
        int input = 9;
        String rsl = DivideBySix.checkNumber(input);
        String expected = "The number divides by 3, but it isn't even number";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenNumberNotDividesBy3AndEven() {
        int input = 14;
        String rsl = DivideBySix.checkNumber(input);
        String expected = "The number doesn't divide by 3, but it is the even number";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenNumberNotDividesBy3AndNotEven() {
        int input = 25;
        String rsl = DivideBySix.checkNumber(input);
        String expected = "The number doesn't divide by 3 and it ins't even number";
        assertThat(rsl).isEqualTo(expected);
    }
}