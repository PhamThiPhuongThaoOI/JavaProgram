package lap07.ex01;

public class Square extends Rectangle {
        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }

        public double getSide() {
            return super.getWidth(); // Square has equal width and length
        }

        public void setSide(double side) {
            super.setWidth(side);
            super.setLength(side);
        }

        @Override
        public void setWidth(double width) {
            setSide(width);
        }

        @Override
        public void setLength(double length) {
            setSide(length);
        }

        @Override
        public String toString() {
            return "Square[" + super.toString() + ", side=" + super.getWidth() + "]";
        }
    }
