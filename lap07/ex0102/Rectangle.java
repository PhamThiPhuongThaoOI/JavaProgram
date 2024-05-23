package lap07.ex0102;

public abstract class Rectangle implements GeometricObject{
    protected double width;
    protected double length;

    public Rectangle ( double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(width+length);

    }


}
