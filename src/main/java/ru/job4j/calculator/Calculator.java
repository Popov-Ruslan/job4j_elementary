package ru.job4j.calculator;

public class Calculator {

    public static void plus(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void minus(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        plus(1, 2);
        plus(10, 11);
        minus(7, 3);
        minus(2, 6);
    }
}
