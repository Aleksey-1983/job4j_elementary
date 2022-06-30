package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        boolean rsl = LogicNot.isEven(2);
        System.out.println(rsl);
        boolean rsl1 = LogicNot.isPositive(-2);
        System.out.println(rsl1);
        boolean rsl2 = LogicNot.notEven(3);
        System.out.println(rsl2);
        boolean rsl3 = LogicNot.notPositive(2);
        System.out.println(rsl3);
        boolean rsl4 = LogicNot.notEvenAndPositive(3);
        System.out.println(rsl4);
        boolean rsl5 = LogicNot.evenOrNotPositive(3);
        System.out.println(rsl5);
    }
}
