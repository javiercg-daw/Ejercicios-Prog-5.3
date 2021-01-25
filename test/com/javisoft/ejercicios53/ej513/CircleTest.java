package com.javisoft.ejercicios53.ej513;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private final Point CENTER;
    private final double RADIUS;
    private Circle circle;

    public CircleTest() {
        this.CENTER = new Point(324.33, -5243.312);
        this.RADIUS = 54.32;
    }

    @BeforeEach
    void setUp() {
        this.circle = new Circle(CENTER, RADIUS);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.0, -1.0, -500.0})
    void negativeOrZeroRadiusThrowsExceptionAtInstantiation(double invalidRadius) {
        assertThrows(IllegalArgumentException.class, () -> new Circle(CENTER, invalidRadius));
    }

    @Test
    void getCenter() {
        assertEquals(circle.getCenter(), CENTER);
    }

    @Test
    void getRadius() {
        assertEquals(circle.getRadius(), RADIUS);
    } 

    @Test
    void setCenter() {
        Point point = new Point(123.456, 987.536);
        circle.setCenter(point);
        assertEquals(circle.getCenter(), point);
    }

    @Test
    void setRadius() {
        double newRadius = 324.563;
        circle.setRadius(newRadius);
        assertEquals(circle.getRadius(), newRadius);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.0, -1.0, -500.0})
    void setRadiusNegativeOrZeroRadiusThrowsException(double invalidRadius) {
        assertThrows(IllegalArgumentException.class, () -> circle.setRadius(invalidRadius));
    }

    @ParameterizedTest
    @CsvSource({
            "54.32,     341.3026",
            "35476.312, 222904.2423",
            "0.12,      0.7540"
    })
    void getCircumference(double newRadius, double output) {
        this.circle.setRadius(newRadius);
        assertEquals(circle.getCircumference(), output, 0.0001);
    }

    @ParameterizedTest
    @CsvSource({
            "89.89,     25384.7350",
            "0.89,      2.4885",
            "47.27,     7019.7408"
    })
    void getArea(double newRadius, double output) {
        circle.setRadius(newRadius);
        assertEquals(circle.getArea(), output, 0.0001);
    }

    @Test
    void testToString() {
        String newStr = "Circle{" +
                "center=" + CENTER +
                ", radius=" + RADIUS +
                '}';
        assertEquals(circle.toString(), newStr);
    }

    @Test
    void testEquals() {
        Circle circlePrime = new Circle(CENTER, RADIUS);
        Circle otherCircle = new Circle(new Point(7624.7546, 356.312), 9.5);
        assertEquals(circle, circlePrime);
        assertNotEquals(circle, otherCircle);
    }
}