package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int rst = 0;
        for (int i = start; i <= finish; i++) {
            rst += i;
        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(3, 7));
        System.out.println(sum(1, 4));
    }
}
