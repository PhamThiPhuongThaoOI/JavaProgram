package lap07.ex0105;

import lap07.ex0105.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1= new Circle(5.5) ;

        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
    }
}
