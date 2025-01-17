package lap12RV.integration;

public class MidpointRule implements Integrator {
    private double precision;
    private int maxIterations;

    public MidpointRule(double precision, int maxIterations) {
        /* TODO */
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        /* TODO */
        int nO= 1;
        double I_n = integrate(poly,lower,upper);
        double I_2n;
        int iterations = 0;

        while (true) {
            iterations++;
            I_2n = integrate(poly,lower,upper,nO *2);

            if ( Math.abs(I_2n - I_n) / 3.0 < precision|| iterations >= maxIterations) {
                break;
            }
            I_n = I_2n;
            nO*=2;
        }
        return I_2n;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double intervalWidth = (upper - lower) / numOfSubIntervals;
        double sum = 0.0;

        for (int i = 0; i< numOfSubIntervals;i++) {
            double midPoint = lower + (i + 0.5)* intervalWidth;
            sum+= poly.evaluate(midPoint);
        }
        return sum* intervalWidth;
    }
}
