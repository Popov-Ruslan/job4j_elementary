package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 80;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 75;
        return result;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(160);
        System.out.println("160 rubles are " + euro + " euros");
        float dollar = rubleToDollar(225);
        System.out.println("225 rubles are " + dollar + " dollars");
    }
}
