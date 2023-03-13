package ru.job4j.array;

public class SortSelected2 {
    public static int[] sort(int[] data) {
        int indexOfMin = 0;
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int start = i + 1;
            for (int j = start; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    indexOfMin = j;
                }
            }
            int tmp = data[i];
            data[i] = data[indexOfMin];
            data[indexOfMin] = tmp;
            indexOfMin = start;
        }
        return data;
    }
}
