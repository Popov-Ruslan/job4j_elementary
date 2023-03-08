package ru.job4j.loop;

public class CheckPrimeNumber {
    /**
     * метод проверяет, является ли число простым, т.е. делится без остатка только на 1 и себя,
     * и само отлично от 1.
     * @param n проверяемое число
     * @return {@code boolean} является ли число простым
     */
    public static boolean check(int n) {
        boolean rst = n > 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                rst = false;
                break;
            }
        }
        return rst;
    }
}
