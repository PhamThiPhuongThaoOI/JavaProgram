package lap12RV.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        /* TODO */ this.coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */if(index<0 ||index>=coefficients.size()) {
            return 0;
        }
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */ double[] coeffArray = new double[coefficients.size()];
        for (int i =0; i<coefficients.size(); i++) {
            coeffArray[i] = coefficients.get(i);
        }
        return coeffArray;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        /* TODO */ if( index< 0 || index > coefficients.size()) {
            throw new IndexOutOfBoundsException( "Index is outside")
        }
         coefficients.add(index,coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        /* TODO */
        if (index<0 ||index> coefficients.size()) {
            throw new IndexOutOfBoundsException(" Index is outside.")
        }
        coefficients.set(index,coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        /* TODO */return coefficients.size()-1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double result = 0;
        for(int i=0; i < coefficients.size();i++) {
            result += coefficients.get(i) * Math.pow(x,i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        ListPolynomial derivative = new ListPolynomial();
        for (int i=1; i< coefficients.size(); i++) {
            derivative.append(coefficients.get(i) *i);
        }
        return derivative;

    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        /* TODO */
        ListPolynomial result = new ListPolynomial();
        int maxDegree = Math.max(this.degree(), another.degree());
        for (int i = 0; i <= maxDegree;i++) {
            double coeff1 = this.coefficient(i);
            double coeff2 = another.coefficient(i);
            result.append(coeff1+coeff2);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        /* TODO */
        ListPolynomial result = new ListPolynomial();
        int maxDegree = Math.max(this.degree(),another.degree());
        for(int i = 0; i <= maxDegree; i++) {
            double coeff1 = this.coefficient(i);
            double coeff2 = another.coefficient(i);
            result.append(coeff1 - coeff2);
            }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        /* TODO */
        ListPolynomial result = new ListPolynomial();
        int newDegree = this.degree() + another.degree();
        for( int i = 0; i<= newDegree; i++) {
            result.append(0.0);
        }
        for (int i = 0; i <=this.degree(); i++) {
            for( int j = 0; j <= another.degree(); j++ ) {
                double newCoefficient = result.coefficient(i+j) +this.coefficient(i) *another.coefficient(i);
                result.set(newCoefficient, i+j);
            }
        }
        return result;
    }
}
