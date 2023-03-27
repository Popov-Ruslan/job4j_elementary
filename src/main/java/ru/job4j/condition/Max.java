package ru.job4j.condition;

public class Max {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        int tmp = max(a, b);
        return c > tmp ? c : tmp;
    }

    public static int max(int a, int b, int c, int d) {
        int tmp = max(a, b, c);
        return d > tmp ? d : tmp;
    }
}
