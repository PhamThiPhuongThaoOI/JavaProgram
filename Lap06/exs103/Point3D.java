package Lap06.exs103;

public class Point3D extends Point2D {
    protected float z = 0.0f;

    public Point3D () {
        super();
        this.z=z;
    }

    public Point3D(float x, float y ,float z) {
        super();
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {

        this.z=z;
    }
    public float[] getXYZ () {
        return new float[]{0.0f,0.0f,z};
    }

    @Override
    public String toString() {
        return "Point3D{" + super.toString()+
                "z=" + z +
                '}';
    }
}
