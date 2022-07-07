package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int sum1 = start; sum1 <= finish; sum1++) {
            sum = sum + sum1;
        }
        return  sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(2, 5));
        System.out.println(sum(5, 9));
    }
}
