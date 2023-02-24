package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        System.out.printf("Man 170 is %.1f%n", manWeight((short) 170));
        System.out.printf("Woman 160 is %.1f", womanWeight((short) 160));
    }

}
