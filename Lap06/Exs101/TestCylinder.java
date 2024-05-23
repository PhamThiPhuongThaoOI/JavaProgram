package Lap06.Exs101;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder01 = new Cylinder();
        System.out.println( " Cylinder: "
                + " radius= "+cylinder01.getRadius()
        + " height = "+ cylinder01.getHeight()
        + " base area ="+ cylinder01.getArea()
        + " colume = "+ cylinder01.getVolume());
        Cylinder cylinder02 = new Cylinder(10.0);
        System.out.println(" Cylinder: "
                + " radius= "+cylinder02.getRadius()
                + " height = "+ cylinder02.getHeight()
                + " base area ="+ cylinder02.getArea()
                + " colume = "+ cylinder02.getVolume());
        Cylinder cylinder03 = new Cylinder(2.0,10.0);
        System.out.println( " Cylinder: "
                + " radius= "+cylinder03.getRadius()
                + " height = "+ cylinder03.getHeight()
                + " base area ="+ cylinder03.getArea()
                + " colume = "+ cylinder03.getVolume());


    }
}
