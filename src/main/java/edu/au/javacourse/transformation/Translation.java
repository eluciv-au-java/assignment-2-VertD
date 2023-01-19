package edu.au.javacourse.transformation;

public class Translation extends AffineTransformation {
    public Translation(double dx, double dy) {
        super(builtInitValue(dx, dy));
    }

    private static Matrix builtInitValue(double dx, double dy) {
        double[][] data = {
                {1, 0, 0},
                {0, 1, 0},
                {dx, dy, 1}
        };
        return new Matrix(data);
    }
}
