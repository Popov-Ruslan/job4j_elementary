package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rst = new int[100];
        int size = 0;
        int changeSum = money - price;
        for (int coin : coins) {
            while (changeSum >= coin) {
                rst[size] = coin;
                size++;
                changeSum -= coin;
            }
        }
        return Arrays.copyOf(rst, size);
    }
}
