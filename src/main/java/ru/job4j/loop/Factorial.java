package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result1 = 1;
        for (int i = 1; i <= n; i++) {
            result1 = result1 * i;
        }
        return result1;
    }
}
