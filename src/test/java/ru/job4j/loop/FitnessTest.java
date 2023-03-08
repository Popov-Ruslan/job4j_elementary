package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FitnessTest {
    @Test
    public void whenIvan30Nik70Then3Months() {
        int ivan = 30;
        int nik = 70;
        int rst = Fitness.calc(ivan, nik);
        int expected = 3;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenIvanLessByOneNik() {
        int ivan = 30;
        int nik = 40;
        int rst = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenIvanGreaterThanNikThen0() {
        int ivan = 95;
        int nik = 90;
        int rst = Fitness.calc(ivan, nik);
        int expected = 0;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int rst = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(rst).isEqualTo(expected);
    }
}