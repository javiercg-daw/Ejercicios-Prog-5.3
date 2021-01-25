package com.javisoft.ejercicios53.ej514;

import com.javisoft.ejercicios53.ej513.Circle;
import com.javisoft.ejercicios53.ej513.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    private Ball ball;
    private final Circle CIRCLE = new Circle(new Point(-1.0, -1.0), 13.33);

    @BeforeEach
    void setUp() {
        ball = new Ball(CIRCLE, "green", "steel");
    }

    @Test
    void getCircle() {
        assertEquals(ball.getCircle(), new Circle(new Point(-1.0, -1.0), 13.33));
    }

    @Test
    void getColor() {
        assertEquals(ball.getColor(), "green");
    }

    @Test
    void getMaterial() {
        assertEquals(ball.getMaterial(), "steel");
    }

    @ParameterizedTest
    @CsvSource({
            "9.0, 3.0, 3.0, true",
            "13.0, -90.0, -30.0, false",
            "130.0, -90.0, 13, true"
    })
    void collides(double radius, double x, double y, boolean output) {
        Ball other = new Ball(new Circle(new Point(x, y), radius), "yellow", "wax");
        assertEquals(ball.collides(other), output);
    }

    @Test
    void testToString() {
        String newStr = "green steel ball, radius: 13.33, position: " + ball.getCircle().getCenter() + ".";
        assertEquals(ball.toString(), newStr);
    }

    @Test
    void testEquals() {
        Ball ballPrime = new Ball(new Circle(new Point(-1.0, -1.0), 13.33), "green", "steel");
        assertEquals(ball, ballPrime);
    }

    @Test
    void testDoesNotEqual() {
        Ball other = new Ball(new Circle(new Point(9.0, 1.0), 13.32), "blue", "rubber");
        assertNotEquals(ball, other);
    }

}