package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean rsl = exist(2, 2, 2);
        System.out.println(rsl);
        boolean rsl1 = exist(1, 1, 3);
        System.out.println(rsl1);
    }
}
