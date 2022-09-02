package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        int rsl = Math.max(second, third);
        return Math.max(first, rsl);
    }

    public static int max(int first, int second, int third, int fourth) {
        int rsl = max(third, fourth);
        return Math.max(Math.max(first, second), rsl);
    }

    public static void main(String[] args) {
        System.out.println(Max.max(1, 2));
        System.out.println(Max.max(1, 2, 3));
        System.out.println(Max.max(1, 2, 3, 4));
    }
}
