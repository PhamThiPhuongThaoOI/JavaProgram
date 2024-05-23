package Lap06.exs201;

public class Line {
    protected Point begin;
    protected Point end;

    public Line ( Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line ( int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public void setBeginX( int BeginX) {
        begin.setX(BeginX);
    }
    public void setBeginY( int BeginY) {
        begin.setY(BeginY);
    }
    public void setBeginXY( int BeginX, int BeginY) {
        begin.setXY(BeginX, BeginY);
    }
    public void setEndX( int EndX) {
        begin.setX(EndX);
    }
    public void setEndY( int EndY) {
        begin.setY(EndY);
    }
    public void setEndXY( int EndX, int EndY) {
        begin.setXY(EndX, EndY);
    }
    public int getLength() {
        int xDiff = this.getBeginX() - this.getEndX();
        int yDiff = this.getBeginY() - this.getEndY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double getGradient() {
        double xDiff = this.getBeginX()-this.getEndX();
        double yDiff= this.getBeginY()- this.getEndY();
        return Math.atan2(yDiff,xDiff);
    }
}



