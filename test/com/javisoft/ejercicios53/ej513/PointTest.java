package com.javisoft.ejercicios53.ej513;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    private final double X_1;
    private final double Y_1;
    private final double X_2;
    private final double Y_2;
    private Point point1;
    private Point point2;

    public PointTest() {
        this.X_1 = -5.66;
        this.Y_1 = 54.54;
        this.X_2 = 3454.34;
        this.Y_2 = -452.623;
    }

    @BeforeEach
    void setUp() {
        this.point1 = new Point(X_1, Y_1);
        this.point2 = new Point(X_2, Y_2);
    }

    @Test
    void getX() {
        assertEquals(point1.getX(), X_1);
        assertEquals(point2.getX(), X_2);
    }

    @RepeatedTest(10)
    void setX() {
        double newX = (Math.random() - 0.5) * 100.0;
        point1.setX(newX);
        assertEquals(point1.getX(), newX, 0.0001);
    }

    @Test
    void getY() {
        assertEquals(point1.getY(), Y_1);
        assertEquals(point2.getY(), Y_2);
    }

    @RepeatedTest(10)
    void setY() {
        double newY = (Math.random() - 0.5) * 100.0;
        point1.setY(newY);
        assertEquals(point1.getY(), newY, 0.0001);
    }

    @RepeatedTest(10)
    void setLocation() {
        double newX = (Math.random() - 0.5) * 100.0;
        double newY = (Math.random() - 0.5) * 100.0;
        point1.setLocation(newX, newY);
        assertEquals(point1.getX(), newX);
        assertEquals(point1.getY(), newY);
    }

    @RepeatedTest(10)
    void move() {
        double dx = (Math.random() - 0.5) * 100.0;
        double dy = (Math.random() - 0.5) * 100.0;
        point1.move(dx, dy);
        assertEquals(point1.getX(), X_1 + dx);
        assertEquals(point1.getY(), Y_1 + dy);
    }

    @Test
    void testToString() {
        String newStr = "Point{" +
                "x=" + X_1 +
                ", y=" + Y_1 +
                '}';
        assertEquals(point1.toString(), newStr);
    }

    @Test
    void testEquals() {
        Point point1Prime = new Point(X_1, Y_1);
        assertNotEquals(point2, point1);
        assertEquals(point1, point1Prime);
    }
}