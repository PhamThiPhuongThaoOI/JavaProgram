package Lap06.exs104;

public class Retangle extends  Shape{
    protected double width;
    protected double lenght;

    public Retangle () {
        width = 1.0;
        lenght = 1.0;
    }
    public Retangle( double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }
    public Retangle( double width, double lenght, String color, boolean filled) {
        super();
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea() {
        return width * lenght;
    }
    public double getPerimeter() {
        return (width + lenght) *2;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
