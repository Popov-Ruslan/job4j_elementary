package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean left = i == j;
                boolean right = i == size - (j + 1);
                if (left) {
                    System.out.print("O");
                } else if (right) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        draw(3);
        System.out.println();
        draw(5);
        System.out.println();
        draw(11);
    }
}
