package lap09.ex0203;

import Lap05.exo102.MyPolynomial;

public class ArrayPoly extends AbstractPoly{
    private final double[] coefficients;
    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }
    @Override
    public int degree() {
        return degree();
    }
    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }
    @Override
    public double coefficient( int degree) {
        return coefficient(degree);
    }
    @Override
    public double[] coefficients() {
        return coefficients;
    }
}
