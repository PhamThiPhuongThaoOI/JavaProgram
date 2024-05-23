package lap09.ex0203;

import java.util.List;

public class ListPoly extends AbstractPoly{
    double[] coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    @Override
    public double coefficient(int i) {
        return coefficients[i];
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }
}



