package edu.au.javacourse.transformation;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Matrix vector) {
        x = vector.getValue(0, 0);
        y = vector.getValue(0, 1);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Matrix asVector() {
        double[][] data = {{x, y, 1} };
        return new Matrix(data);
    }
}
