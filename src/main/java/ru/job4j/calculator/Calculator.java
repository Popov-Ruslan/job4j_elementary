package ru.job4j.calculator;

public class Calculator {

    public static void plus(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
    }
}
