package com.javisoft.ejercicios53.ej513;

import java.util.Objects;

public class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        if (radius <= 0.0) {
            throw new IllegalArgumentException("Provided radius is less than or equal to zero.");
        }
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        if (radius <= 0.0) {
            throw new IllegalArgumentException("Provided radius is less than or equal to zero.");
        }
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && center.equals(circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
