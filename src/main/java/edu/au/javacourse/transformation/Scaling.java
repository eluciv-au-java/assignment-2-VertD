package edu.au.javacourse.transformation;

public class Scaling extends AffineTransformation {
    public Scaling(double kx, double ky) {
        super(buildInitValue(kx, ky));
    }

    private static Matrix buildInitValue(double kx, double ky) {
        double[][] data = {
                {kx, 0, 0},
                {0, ky, 0},
                {0, 0, 1}
        };
        return new Matrix(data);
    }
}
