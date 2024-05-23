package lap07.ex0105;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle( double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }
    public double resize( int percent) {
        return radius*= percent/100.0;
    }
}

