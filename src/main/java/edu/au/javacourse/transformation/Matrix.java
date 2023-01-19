package edu.au.javacourse.transformation;

public class Matrix {
    private double[][] data;

    public Matrix(double[][] data) {
        this.data = data.clone();
    }

    public Matrix multiply(Matrix other) { // TODO проверка размеров
        int row = data.length;
        int column = other.data[0].length;
        int rowOther = data[0].length;
        double[][] d = new double[row][column];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                d[i][j] = 0;
                for (int k = 0; k < rowOther; ++k) {
                    d[i][j] += data[i][k] * other.getValue(k, j);
                }
            }
        }
        return new Matrix(d);
    }

    public double getValue(int row, int column) {
        return data[row][column];
    }

}