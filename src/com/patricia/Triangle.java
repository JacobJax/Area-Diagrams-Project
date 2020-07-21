package com.patricia;

public class Triangle {
    private double base;
    private double height;
    private double triangleArea;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void calculateTriangleArea() {
        triangleArea = 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getTriangleArea() {
        return triangleArea;
    }
}
