package lap12RV.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    protected double[] coefficents;

    @Override
    public String toString() {
        /* TODO */
        if (coefficents == null || coefficents.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < coefficents.length; i++) {
            if (i > 0) {
                sb.append("+");
            }
            sb.append(coefficents[i]);
            if (i > 0) {
                sb.append("x");
                if (i > 1) {
                    sb.append("^").append(i);
                }
            }
            sb.append("]");

        }
        return sb.toString();

    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        if(coefficents==null||coefficents.length==0) {
            return new double[]{0};
        }
        double[] derivativeCoefficents = new double[coefficents.length -1];
        for (int i=1;i<coefficents.length; i++) {
            derivativeCoefficents[i-1] = coefficents[i] *i;
        }
        return derivativeCoefficents;
    }

}
