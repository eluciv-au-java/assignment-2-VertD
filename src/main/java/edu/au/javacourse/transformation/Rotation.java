package edu.au.javacourse.transformation;

public class Rotation extends AffineTransformation {
    public Rotation(double alpha) {
        super(buildInitValue(alpha));
    }

    private static Matrix buildInitValue(double alpha) {
        double cos = Math.cos(alpha);
        double sin = Math.sin(alpha);
        double[][] data = {
                {cos, sin, 0},
                {-sin, cos, 0},
                {0, 0, 1}
        };
        return new Matrix(data);
    }
}