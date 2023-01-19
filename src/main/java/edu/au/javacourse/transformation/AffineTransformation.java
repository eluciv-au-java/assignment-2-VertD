package edu.au.javacourse.transformation;

public class AffineTransformation implements Transformation {

    private Matrix matrix;

    public AffineTransformation() {
        this(buildInitValue());
    }

    private static Matrix buildInitValue() {
        double[][] data = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        return new Matrix(data);
    }

    public AffineTransformation(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public Point apply(Point p) {
        return new Point(p.asVector().multiply(matrix));
    }

    public AffineTransformation thenDo(AffineTransformation next) {
        return new AffineTransformation(matrix.multiply(next.matrix));
    }

}
