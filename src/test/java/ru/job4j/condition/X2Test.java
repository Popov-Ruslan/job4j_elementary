package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int rst = X2.calc(a, b, c, x);
        int expected = 40;
        Assert.assertEquals(rst, expected);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int rst = X2.calc(a, b, c, x);
        int expected = 3;
        Assert.assertEquals(rst, expected);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int rst = X2.calc(a, b, c, x);
        int expected = 2;
        Assert.assertEquals(rst, expected);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int rst = X2.calc(a, b, c, x);
        int expected = 2;
        Assert.assertEquals(rst, expected);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int rst = X2.calc(a, b, c, x);
        int expected = 1;
        Assert.assertEquals(rst, expected);
    }
}