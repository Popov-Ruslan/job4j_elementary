package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second) + divide(first, second);
    }

    public static double sumAndMultiplyAndSubtractAndDivide(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + subtract(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма + умножение: " + sumAndMultiply(10, 20));
        System.out.println("Вычитание + деление: " + subtractAndDivide(10, 20));
        System.out.println("Сумма + умножение + вычитание + деление: "
                + sumAndMultiplyAndSubtractAndDivide(10, 20));
    }
}
