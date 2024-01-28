package  module_3;
public class QuadraticEquationSolver {
    public static void main(String[] args) {

    }

    public double[] solve(int a, int b, int c) {
        double D = b * b - 4 * a * c;
        if (D < 0) {
            return new double[0];
        } else if (D == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        } else {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);

            if (x1 < x2) {
                return new double[]{x1, x2};

            } else {
                return new double[]{x1, x2};

            }
        }

    }


}


