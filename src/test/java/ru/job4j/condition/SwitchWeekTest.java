package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void when1ToMonday() {
        int in = 1;
        String result = SwitchWeek.nameOFDay(in);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);

    }

    @Test
    public void when2ToTuesday() {
        int in = 2;
        String result = SwitchWeek.nameOFDay(in);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when3ToWednesday() {
        int in = 3;
        String result = SwitchWeek.nameOFDay(in);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4ToThursday() {
        int in = 4;
        String result = SwitchWeek.nameOFDay(in);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when5ToFriday() {
        int in = 5;
        String result = SwitchWeek.nameOFDay(in);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when6ToSaturday() {
        int in = 6;
        String result = SwitchWeek.nameOFDay(in);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when7ToSunday() {
        int in = 7;
        String result = SwitchWeek.nameOFDay(in);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when8ToError() {
        int in = 8;
        String result = SwitchWeek.nameOFDay(in);
        String expected = "Нет такого дня недели";
        Assert.assertEquals(expected,result);
    }
}
