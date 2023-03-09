package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MortgageTest {
    @Test
    public void whenAmount1000Salary1200Percent1ThenYear1() {
        double amount = 1000;
        double salary = 1200;
        double percent = 1;
        int rst = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenAmount1000Salary1200Percent20ThenYear1() {
        double amount = 1000;
        double salary = 1200;
        double percent = 20;
        int rst = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenAmount100Salary120Percent50ThenYear2() {
        double amount = 100;
        double salary = 120;
        double percent = 50;
        int rst = Mortgage.year(amount, salary, percent);
        int expected = 2;
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    public void whenAmount100Salary70Percent50ThenYear4() {
        double amount = 100;
        double salary = 70;
        double percent = 50;
        int rst = Mortgage.year(amount, salary, percent);
        int expected = 4;
        assertThat(rst).isEqualTo(expected);
    }
}