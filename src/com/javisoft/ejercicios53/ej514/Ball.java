package com.javisoft.ejercicios53.ej514;

import com.javisoft.ejercicios53.ej513.Circle;

import java.util.Objects;

public class Ball {
    private Circle circle;
    private String color;
    private String material;

    public Ball(Circle circle, String color, String material) {
        this.circle = circle;
        this.color = color;
        this.material = material;
    }

    public Circle getCircle() {
        return circle;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public boolean collides(Ball other) {
        Circle otherCircle = other.getCircle();
        double lengthOfSegmentBetweenCenters = Math.sqrt(
                Math.pow(circle.getCenter().getX() - otherCircle.getCenter().getX(), 2) +
                        Math.pow(circle.getCenter().getY() - otherCircle.getCenter().getY(), 2));
        return circle.getRadius() + otherCircle.getRadius() >= lengthOfSegmentBetweenCenters;
    }

    public String toString() {
        return color + " " + material + " ball, radius: " + circle.getRadius() + ", position: " + circle.getCenter() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return circle.equals(ball.circle) && color.equals(ball.color) && material.equals(ball.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(circle, color, material);
    }
}
