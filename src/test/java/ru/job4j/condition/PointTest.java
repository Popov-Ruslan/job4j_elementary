package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX0Y0X2Y0() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double result = first.distance(second);
        double expected = 2;
        assertEquals(result, expected, 0.0001f);
    }

    @Test
    public void whenX1Y1X1Y7() {
        Point first = new Point(1, 1);
        Point second = new Point(1, 7);
        double result = first.distance(second);
        double expected = 6;
        assertEquals(result, expected, 0.0001f);
    }

    @Test
    public void whenXminus1Yminus2X1Y2() {
        Point first = new Point(-1, -2);
        Point second = new Point(1, 2);
        double result = first.distance(second);
        double expected = 4.4721;
        assertEquals(result, expected, 0.0001f);
    }
}