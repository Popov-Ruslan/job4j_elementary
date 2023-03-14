package ru.job4j.array;

public class SortSelected2 {
    public static int[] sort(int[] data) {
        int indexOfMin = 0;
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    indexOfMin = j;
                }
            }
            int tmp = data[i];
            data[i] = data[indexOfMin];
            data[indexOfMin] = tmp;
            indexOfMin = i + 1;
        }
        return data;
    }
}
