package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX0Y0X2Y0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        assertEquals(result, expected, 0.0001f);
    }

    @Test
    public void whenX1Y1X1Y7() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 7;
        double result = Point.distance(x1, y1, x2, y2);
        double expected = 6;
        assertEquals(result, expected, 0.0001f);
    }

    @Test
    public void whenXminus1Yminus2X1Y2() {
        int x1 = -1;
        int y1 = -2;
        int x2 = 1;
        int y2 = 2;
        double result = Point.distance(x1, y1, x2, y2);
        double expected = 4.4721;
        assertEquals(result, expected, 0.0001f);
    }
}