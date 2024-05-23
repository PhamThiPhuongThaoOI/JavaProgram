package lap12RV.integration;

import java.io.*;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        try (BufferedReader reader = new BufferedReader(new FileReader("test_input.txt"));
             PrintWriter writer = new PrintWriter(new FileWriter("YourName_YourStudentID_Integration.txt"))) {

            writer.println("Integration Calculator Test Drive\n");

            String line;
            while ((line = reader.readLine()) != null) {
                switch (line) {
                    case "ArrayPolynomial":
                        writer.println("Testing ArrayPolynomial...");
                        testArrayPolynomial(reader, writer);
                        break;
                    case "ListPolynomial":
                        writer.println("Testing ListPolynomial...");
                        testListPolynomial(reader, writer);
                        break;
                    case "IntegrationCalculator":
                        writer.println("Testing IntegrationCalculator...");
                        testIntegrationCalculator(reader, writer);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

    public static void testArrayPolynomial(BufferedReader reader, PrintWriter writer) {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        double[] coefficients = Arrays.stream(reader.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        ArrayPolynomial poly = new ArrayPolynomial(coefficients);

        writer.println("Initial polynomial: " + poly);

        // Read append value
        double appendValue = Double.parseDouble(reader.readLine());
        poly.append(appendValue);
        writer.println("After appending " + appendValue + ": " + poly);

        // Read set value and index
        String[] setLine = reader.readLine().split(" ");
        int setIndex = Integer.parseInt(setLine[0]);
        double setValue = Double.parseDouble(setLine[1]);
        poly.set(setValue, setIndex);
        writer.println("After setting coefficient at index " + setIndex + " to " + setValue + ": " + poly);

        // Test evaluating the polynomial at x = 2
        double value = poly.evaluate(2);
        writer.println("Value of polynomial at x = 2: " + value);

        // Test polynomial operations
        ArrayPolynomial anotherPoly = new ArrayPolynomial(new double[]{1, 1, 1});
        writer.println("Another polynomial: " + anotherPoly);

        ArrayPolynomial sum = poly.plus(anotherPoly);
        writer.println("Sum of polynomials: " + sum);

        ArrayPolynomial difference = poly.minus(anotherPoly);
        writer.println("Difference of polynomials: " + difference);

        ArrayPolynomial product = poly.multiply(anotherPoly);
        writer.println("Product of polynomials: " + product);


    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        ListPolynomial poly = new ListPolynomial();
        poly.append(1).append(2).append(3);

        writer.println("Initial polynomial: " + poly);

        // Test appending a coefficient
        poly.append(4); // Now polynomial should be 1 + 2x + 3x^2 + 4x^3
        writer.println("After appending 4: " + poly);

        // Test setting a coefficient
        poly.set(5, 1); // Now polynomial should be 1 + 5x + 3x^2 + 4x^3
        writer.println("After setting coefficient at index 1 to 5: " + poly);

        // Test evaluating the polynomial at x = 2
        double value = poly.evaluate(2);
        writer.println("Value of polynomial at x = 2: " + value);

        // Test polynomial operations
        ListPolynomial anotherPoly = new ListPolynomial();
        anotherPoly.append(1).append(1).append(1);
        writer.println("Another polynomial: " + anotherPoly);

        ListPolynomial sum = poly.plus(anotherPoly);
        writer.println("Sum of polynomials: " + sum);

        ListPolynomial difference = poly.minus(anotherPoly);
        writer.println("Difference of polynomials: " + difference);

        ListPolynomial product = poly.multiply(anotherPoly);
        writer.println("Product of polynomials: " + product);
    }
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        Polynomial poly = new ArrayPolynomial(new double[]{1, 2, 3});

        // Create an IntegrationCalculator with MidpointRule
        Integrator midpointIntegrator = new MidpointRule(1e-6, 100);
        IntegrationCalculator calc = new IntegrationCalculator(midpointIntegrator, poly);

        double lower = 0;
        double upper = 1;

        writer.println("Using MidpointRule to integrate " + poly + " from " + lower + " to " + upper);
        double result = calc.integrate(lower, upper);
        writer.println("Result: " + result);

        // Change to TrapezoidRule
        Integrator trapezoidIntegrator = new TrapezoidRule(1e-6, 100);
        calc.setIntegrator(trapezoidIntegrator);

        writer.println("Using TrapezoidRule to integrate " + poly + " from " + lower + " to " + upper);
        result = calc.integrate(lower, upper);
        writer.println("Result: " + result);

        // Change to SimpsonRule
        Integrator simpsonIntegrator = new SimpsonRule(1e-6, 100);
        calc.setIntegrator(simpsonIntegrator);

        writer.println("Using SimpsonRule to integrate " + poly + " from " + lower + " to " + upper);
        result = calc.integrate(lower, upper);
        writer.println("Result: " + result);
    }
    }
}
