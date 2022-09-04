package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), third, fourth);
    }

    public static void main(String[] args) {
        System.out.println(Max.max(1, 2));
        System.out.println(Max.max(1, 2, 3));
        System.out.println(Max.max(1, 2, 3, 4));
    }
}
