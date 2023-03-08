package ru.job4j.loop;

public class Board2 {
    public static void paint(int width, int height) {
        for (int i = 1; i <= height; i++) {
            System.out.println();
            for (int j = 1; j <= width; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        paint(7, 10);
    }
}
