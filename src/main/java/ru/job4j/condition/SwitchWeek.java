package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOFDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Нет такого дня недели.";
        }
        return name;
    }

    public static void main(String[] args) {
        String result1 = SwitchWeek.nameOFDay(1);
        System.out.println(result1);
        String result2 = SwitchWeek.nameOFDay(2);
        System.out.println(result2);
        String result3 = SwitchWeek.nameOFDay(3);
        System.out.println(result3);
        String result4 = SwitchWeek.nameOFDay(4);
        System.out.println(result4);
        String result5 = SwitchWeek.nameOFDay(5);
        System.out.println(result5);
        String result6 = SwitchWeek.nameOFDay(6);
        System.out.println(result6);
        String result7 = SwitchWeek.nameOFDay(7);
        System.out.println(result7);
        String result8 = SwitchWeek.nameOFDay(8);
        System.out.println(result8);
    }
}



