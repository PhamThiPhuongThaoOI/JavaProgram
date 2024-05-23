package lap09.ex0203;

import java.util.Objects;

public abstract class AbstractPoly implements Poly{
    double[] derive() {
        return new double[]{};
    }

    @Override
    public boolean equals(Object o) {
        if( this==o) {
            return true;
        }
        if(o==null||getClass() != o.getClass()) {
            return false;
        }
        AbstractPoly other = (AbstractPoly) o;
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        return "AbstractPoly{}";
    }
}
