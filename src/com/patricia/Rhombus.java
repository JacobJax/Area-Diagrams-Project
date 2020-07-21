package com.patricia;

public class Rhombus {
    private double diagonal_a;
    private double diagonal_b;
    private double rhombusArea;

    public Rhombus(double diagonal_a, double diagonal_b) {
        this.diagonal_a = diagonal_a;
        this.diagonal_b = diagonal_b;
    }

    public void calculateRhombusArea() {
        rhombusArea = (diagonal_a * diagonal_b) / 2;
    }

    public double getDiagonal_a() {
        return diagonal_a;
    }

    public double getDiagonal_b() {
        return diagonal_b;
    }

    public double getRhombusArea() {
        return rhombusArea;
    }
}
