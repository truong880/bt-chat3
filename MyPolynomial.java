public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                result.append(formatTerm(coeffs[i], i));
            }
        }
        return result.toString();
    }

    private String formatTerm(double coeff, int power) {
        if (coeff == 0) {
            return "";
        }
        if (power == 0) {
            return String.format("%.2f", coeff);
        }
        if (power == 1) {
            return String.format("%.2fx", coeff);
        }
        return String.format("%.2fx^%d", coeff, power);
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result = result * x + coeffs[i];
        }
        return result;
    }
}
