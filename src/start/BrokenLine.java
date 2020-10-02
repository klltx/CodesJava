package start;

import java.util.ArrayList;
import java.util.List;

public class BrokenLine {
    List<Point> points = new ArrayList<>();

    public BrokenLine() {
    }

    public BrokenLine(List<Point> points) {
        this.points = points;
    }

    int lineLength(){
        int length = 0;
        for (int i = 1; i < points.size(); i++){
            length += (points.get(i).x - points.get(i - 1).x) * (points.get(i).x - points.get(i - 1).x) + (points.get(i).y - points.get(i - 1).y) * (points.get(i).y - points.get(i - 1).y);
        }
        return (int) Math.sqrt(length);
    }

    @Override
    public String toString() {
        return "Line" + points;
    }
}
