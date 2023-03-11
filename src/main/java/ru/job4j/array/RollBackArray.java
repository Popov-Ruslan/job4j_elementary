package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] rst = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int lastIndex = rst.length - 1 - i;
            int currentIndex = i;
            rst[lastIndex] = array[currentIndex];
        }
        return rst;
    }
}
