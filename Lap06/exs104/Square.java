package Lap06.exs104;

import java.security.PublicKey;

public class Square extends Retangle{
    protected double side;
    public Square() {
        this.side = side;
    }
    public  Square( double side) {
        super(side,side);
    }
    public Square( double side, String color, boolean filled) {
        super() ;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth( double side) {
        this.side = side;
    }
    public void setLength( double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
