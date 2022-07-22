package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min1 = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (array[i] < min1) {
                min1 = array[i];
            }
        }
        return min1;
    }
}
