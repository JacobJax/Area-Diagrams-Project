package com.patricia;

public class Square {
    private double side;
    private double sqArea;

    public Square(double side) {
        this.side = side;
    }

    public void calculateSquareArea() {
        sqArea = side * side;
    }

    public double getSide() {
        return side;
    }

    public double getSqArea() {
        return sqArea;
    }
}
