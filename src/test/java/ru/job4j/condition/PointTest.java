package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(expected).isEqualTo(dist, offset(0.01));

    }

    @Test
    public void when11to33Then82() {
        double expected = 2.82;
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        double dist = a.distance(b);
        assertThat(expected).isEqualTo(dist, offset(0.01));
    }

    @Test
    public void when33to77Then65() {
        double expected = 5.65;
        Point a = new Point(3, 3);
        Point b = new Point(7, 7);
        double dist = a.distance(b);
        assertThat(expected).isEqualTo(dist, offset(0.01));
    }

    @Test
    public void when002to021Then23() {
        double expected = 2.23;
        Point a = new Point(0, 0, 2);
        Point b = new Point(0, 2, 1);
        double dist = a.distance3d(b);
        assertThat(expected).isEqualTo(dist, offset(0.01));
    }
}