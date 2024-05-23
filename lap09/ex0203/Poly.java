package lap09.ex0203;

public interface Poly {
    int degree();
    Poly derivative();
    double coefficient( int degree);
    double[] coefficients();
}
