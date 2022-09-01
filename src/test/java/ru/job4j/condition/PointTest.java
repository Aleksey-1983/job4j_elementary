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
        assertThat(expected).isEqualTo(dist, offset (0.01));

    }

    @Test
    public void when11to33Then82() {
        double expected = 2.82;
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        double dist = a.distance(b);
        assertThat(expected).isEqualTo(dist, offset (0.01));
    }

    @Test
    public void when22to77Then65() {
        double expected = 5.65;
        Point a = new Point(3, 3);
        Point b = new Point(7, 7);
        double dist = a.distance(b);
        assertThat(expected).isEqualTo(dist, offset (0.01));
    }
}