package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double result = SqArea.square(p, k);
        double expected = 2;
        assertEquals(result, expected, 0.01);
    }

    @Test
    public void whenP4K1Then1() {
        double p = 4;
        double k = 1;
        double result = SqArea.square(p, k);
        double expected = 1;
        assertEquals(result, expected, 0.01);
    }

    @Test
    public void whenP30K4Then36() {
        double p = 30;
        double k = 4;
        double result = SqArea.square(p, k);
        double expected = 36;
        assertEquals(result, expected, 0.01);
    }
}