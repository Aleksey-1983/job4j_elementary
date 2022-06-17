package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double rsl1 = y2 - y1;
        double first = Math.pow(rsl, 2);
        double second = Math.pow(rsl1, 2);
        double third = first + third;
        double fourth = Math.sqrt(third);
        return fourth;

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}