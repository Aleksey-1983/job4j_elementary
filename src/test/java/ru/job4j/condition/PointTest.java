package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when11to33Then82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to77Then65() {
        double expected = 5.65;
        int x1 = 3;
        int y1 = 3;
        int x2 = 7;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}