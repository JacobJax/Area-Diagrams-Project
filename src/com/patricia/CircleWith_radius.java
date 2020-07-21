package com.patricia;

public class CircleWith_radius extends Circle {
    private double radius;
    private double circleArea;

    public CircleWith_radius(double diameter, double circleArea, double radius) {
        super(diameter, circleArea);
        this.radius = radius;
    }

    public CircleWith_radius(double diameter, double radius) {
        super(diameter);
        this.radius = radius;
    }

    public CircleWith_radius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        circleArea = 3.142 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getCircleArea() {
        return circleArea;
    }
}
