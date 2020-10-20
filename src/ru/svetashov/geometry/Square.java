package ru.svetashov.geometry;

import java.util.ArrayList;
import java.util.List;

public class Square extends Figure{
    Point leftTop;
    private int width;

    public Square(Point leftTop, int width) {
        this.leftTop = leftTop;
        if (width < 0)
            throw new IllegalArgumentException("Incorrect width argument");
        this.width = width;
    }

    public Square(int x, int y, int width){
        this(new Point(x, y), width);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0)
            throw new IllegalArgumentException("Incorrect width argument");
        this.width = width;
    }

    public double getArea(){
        return width * width;
    }

    public BrokenLine brokenLine(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(leftTop.x, leftTop.y));
        points.add(new Point(leftTop.x + getWidth(), leftTop.y));
        points.add(new Point(leftTop.x + getWidth(), leftTop.y - getWidth()));
        points.add(new Point(leftTop.x, leftTop.y - getWidth()));
        ClosedLine line = new ClosedLine(points);
        return line;
    }

    @Override
    public String toString() {
        return "Square in point: " + leftTop + " width: " + getWidth();
    }
}