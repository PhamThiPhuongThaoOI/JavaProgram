package Lap05.ex01;
import java.util.Scanner;
public class MyComplex {
    private double real;
    private double imag;
    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    public MyComplex multiply(MyComplex right) {
        double tempReal = this.real * right.real - this.imag * right.imag;
        double tempImag = this.real * right.imag + this.imag * right.real;
        this.real = tempReal;
        this.imag = tempImag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double divisor = right.real * right.real + right.imag * right.imag;
        double tempReal = (this.real * right.real + this.imag * right.imag) / divisor;
        double tempImag = (this.imag * right.real - this.real * right.imag) / divisor;
        this.real = tempReal;
        this.imag = tempImag;
        return this;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();

        MyComplex complex1 = new MyComplex(real1, imag1);
        MyComplex complex2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + complex1);
        System.out.println(complex1.isReal() ? "Number 1 is a pure real number" : "Number 1 is not a pure real number");
        System.out.println(complex1.isImaginary() ? "Number 1 is a pure imaginary number" : "Number 1 is not a pure imaginary number");

        System.out.println("Number 2 is: " + complex2);
        System.out.println(complex2.isReal() ? "Number 2 is a pure real number" : "Number 2 is not a pure real number");
        System.out.println(complex2.isImaginary() ? "Number 2 is a pure imaginary number" : "Number 2 is not a pure imaginary number");

        System.out.println(complex1.equals(complex2) ? "The numbers are equal" : "The numbers are not equal");

        MyComplex sum = complex1.addNew(complex2);
        System.out.println(complex1 + " + " + complex2 + " = " + sum);
    }
}
