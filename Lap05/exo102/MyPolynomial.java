package Lap05.exo102;
import java.util.Scanner;
public class MyPolynomial {
        private double[] coeffs;

        public MyPolynomial(double... coeffs) {
            this.coeffs = coeffs;
        }

        public int getDegree() {
            return coeffs.length - 1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = coeffs.length - 1; i >= 0; i--) {
                if (i == coeffs.length - 1) {
                    sb.append(coeffs[i] + "x^" + i);
                } else {
                    sb.append(" + " + coeffs[i] + "x^" + i);
                }
            }
            return sb.toString();
        }

        public double evaluate(double x) {
            double result = 0;
            for (int i = 0; i < coeffs.length; i++) {
                result += coeffs[i] * Math.pow(x, i);
            }
            return result;
        }

        public MyPolynomial add(MyPolynomial another) {
            int maxLength = Math.max(coeffs.length, another.coeffs.length);
            double[] resultCoeffs = new double[maxLength];
            for (int i = 0; i < maxLength; i++) {
                double thisCoeff = (i < coeffs.length) ? coeffs[i] : 0;
                double anotherCoeff = (i < another.coeffs.length) ? another.coeffs[i] : 0;
                resultCoeffs[i] = thisCoeff + anotherCoeff;
            }
            return new MyPolynomial(resultCoeffs);
        }

        public MyPolynomial multiply(MyPolynomial another) {
            int newDegree = getDegree() + another.getDegree();
            double[] resultCoeffs = new double[newDegree + 1];
            for (int i = 0; i < coeffs.length; i++) {
                for (int j = 0; j < another.coeffs.length; j++) {
                    resultCoeffs[i + j] += coeffs[i] * another.coeffs[j];
                }
            }
            return new MyPolynomial(resultCoeffs);
        }

        public static void main(String[] args) {
            MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
            MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
            MyPolynomial polynomial3 = new MyPolynomial(1.2, 3.4, 5.6, 7.8);

            System.out.println("Polynomial 1: " + polynomial1);
            System.out.println("Degree of Polynomial 1: " + polynomial1.getDegree());
            System.out.println("Evaluate Polynomial 1 at x=2: " + polynomial1.evaluate(2));

            System.out.println("Polynomial 2: " + polynomial2);
            System.out.println("Degree of Polynomial 2: " + polynomial2.getDegree());
            System.out.println("Evaluate Polynomial 2 at x=3: " + polynomial2.evaluate(3));

            System.out.println("Addition of Polynomial 1 and Polynomial 3: " + polynomial1.add(polynomial3));
            System.out.println("Multiplication of Polynomial 1 and Polynomial 3: " + polynomial1.multiply(polynomial3));
        }
}
