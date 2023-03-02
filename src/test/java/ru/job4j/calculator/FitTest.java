package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan170Then80dot5() {
        short manHeight = 170;
        double result = Fit.manWeight(manHeight);
        double expected = 80.5;
        assertEquals(result, expected, 0.1f);
    }

    @Test
    public void whenWoman160Then57dot5() {
        short womanHeight = 160;
        double result = Fit.womanWeight(womanHeight);
        double expected = 57.5;
        assertEquals(result, expected, 0.1f);
    }
}