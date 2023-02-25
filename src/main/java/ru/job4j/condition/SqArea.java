package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        return Math.pow((p / (2 * k + 2)), 2) * k;
    }

    public static void main(String[] arguments) {
        double result = square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result);
        double result2 = square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result2);
        double result3 = square(30, 4);
        System.out.println("p = 30, k = 4, s = 36, real = " + result3);
    }
}
