package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = SqArea.square(4, 1);
        double result1 = SqArea.square(6, 2);
        double result2 = SqArea.square(7, 3);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        System.out.println("p = 6, k = 2, s = 2, real = " + result1);
        System.out.println("p = 7, k = 3, s = 2.296, real = " + result2);
    }
}
