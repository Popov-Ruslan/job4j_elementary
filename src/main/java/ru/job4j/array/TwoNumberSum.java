package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] rst = new int[0];
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            if (array[i] + array[j] > target) {
                j--;
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                rst = new int[2];
                rst[0] = i;
                rst[1] = j;
                return rst;
            }
        }
        return rst;
    }
}
