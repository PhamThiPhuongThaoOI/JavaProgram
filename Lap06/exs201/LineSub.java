package Lap06.exs201;

public class LineSub extends Point{
    Point end;

    public LineSub ( int beginX, int beginY, int endX, int endY) {
        super( beginX, beginY);
        this.end = new Point ( endX, endY);
    }
    public LineSub( Point begin, Point end) {
        super( begin.getX(), begin.getY()) ;
        this.end=end;
    }

    @Override
    public String toString() {
        return "LineSub{" +
                "end=" + end +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(int beginX, int beginY) {
        super.setX(beginX);
        super.setY(beginY);
    }
    public void setEnd( int endX, int endY) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }
    public int getBeginY() {
        return super.getY();
    }
    public int getEndX() {
        return this.getEnd().getX();
    }
    public int getEndY() {
        return this.getEnd().getY();
    }

    public void setBeginX(int beginX){
        super.setX(beginX);
    }
    public void setBeginY( int beginY) {
        super.setY(beginY);
    }
    public void setBeginXY( int beginX, int beginY) {
        super.setXY(beginX,beginY);
    }
    public void setEndX(int endX) {
        this.setX(endX);
    }
    public void setEndY( int endY) {
        this.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        this.setXY(endX, endY);
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
