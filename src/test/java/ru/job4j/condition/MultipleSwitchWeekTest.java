package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayTo1() {
        String name = "Понедельник.";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTuesdayTo2() {
        String name = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWednesdayTo3() {
        String name = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThursdayTo4() {
        String name = "Четверг";
        int result  = MultipleSwitchWeek.numberOfDay(name);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFridayTo5() {
        String name = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSaturdayTo6() {
        String name = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSundayTo7() {
        String name = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }
    }