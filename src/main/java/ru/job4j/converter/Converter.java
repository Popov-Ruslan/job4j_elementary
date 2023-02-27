package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return  value / 80;
    }

    public static float rubleToDollar(float value) {
        return value / 75;
    }

    public static void main(String[] args) {
        float in = 160;
        float expected = 2;
        float euro = rubleToEuro(in);
        boolean passed = expected == euro;
        System.out.println("160 rubles to euro are 2. Test result: " + passed);
        float inDol = 225;
        float expected2 = 3;
        float dollar = rubleToDollar(inDol);
        boolean passed2 = expected2 == dollar;
        System.out.println("225 rubles to dollar are 3. Test result: " + passed2);
    }
}
