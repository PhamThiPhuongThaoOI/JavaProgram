package Lap06.exs202;

public class Circle {
    protected double radius = 1.0;
    protected String color = "red";
    public Circle() {
        radius = 1.0;
        color = "red" ;
    }
    public Circle( double radius) {
        this.radius=radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius( double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
