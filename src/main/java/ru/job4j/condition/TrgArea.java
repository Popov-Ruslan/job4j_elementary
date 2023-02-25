package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] arguments) {
        double result = area(2, 2, 2);
        System.out.printf("area 2, 2, 2 is %.2f%n", result);
    }
}
