package Lap06.exs104;
//moi quan he hop dong là movables
public abstract class Circle extends Shape implements Movables {
    protected double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }
    public Circle( double radius) {
        super();
        this.radius = radius;
    }
    public  Circle( double radius, String color, boolean filled) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius*radius;
    }
    public double getPerimeter() {
        return 2* Math.PI *radius;
    }
    @Override
    public  void moveUp( double delta){

    }
    @Override
    public void moveDown( double delta){

    }
    @Override
    public void moveLeft( double delta){

    }
    @Override
    public void moveRight( double delta) {

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}
