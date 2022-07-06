package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник" -> 1;
            case "Вторник" -> 2;
            case "Среда" -> 3;
            case "Четверг" -> 4;
            case "Пятница" -> 5;
            case "Суббота" -> 6;
            case "Воскресенье" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        int result1 = numberOfDay("Понедельник");
        System.out.println(result1);
        int result2 = numberOfDay("Вторник");
        System.out.println(result2);
        int result3 = numberOfDay("Среда");
        System.out.println(result3);
        int result4 = numberOfDay("Четверг");
        System.out.println(result4);
        int result5 = numberOfDay("Пятница");
        System.out.println(result5);
        int result6 = numberOfDay("Суббота");
        System.out.println(result6);
        int result7 = numberOfDay("Воскресенье");
        System.out.println(result7);
    }
}
