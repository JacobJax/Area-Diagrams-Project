package com.patricia;

public class Circle {
    private double diameter;
    private double circleArea;

    public Circle(double diameter, double circleArea) {
        this.diameter = diameter;
        this.circleArea = circleArea;
    }

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public Circle() {
    }

    public void calculateArea() {
        circleArea = 3.142 * ((getDiameter() / 2) * (getDiameter() / 2));
    }

    public double getDiameter() {
        return diameter;
    }

    public double getCircleArea() {
        return circleArea;
    }
}
