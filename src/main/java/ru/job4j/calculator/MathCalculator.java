package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static double subtractAndShape(double first, double second) {
        return subtract(first, second)
                + shape(first, second);

    }

    public static double next(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtract(first, second)
                + shape(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractAndShape(10, 20));
        System.out.println("Результат расчета равен: " + next(15, 20));
    }

}


