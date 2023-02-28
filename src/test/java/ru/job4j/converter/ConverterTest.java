package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert160RubThen2Eur() {
        float in = 160;
        float rst = Converter.rubleToEuro(in);
        float expected = 2;
        float eps = 0.0001f;
        Assert.assertEquals(rst, expected, eps);
    }

    @Test
    public void whenConvert200RubThen2dot6667() {
        float in = 200;
        float rst = Converter.rubleToDollar(in);
        float expected = 2.6667f;
        float eps = 0.0001f;
        Assert.assertEquals(rst, expected, eps);
    }
}