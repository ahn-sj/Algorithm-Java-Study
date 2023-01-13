package study.jaeworkspace.baekjoon.w04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Foo {
    public static void main(String[] args) {

        List<Point> points = Arrays.asList(
                new Point(3,5),
                new Point(1,2),
                new Point(2,6),
                new Point(5,3),
                new Point(2,2));

        Collections.sort(points);

        for (Point point : points) {
            System.out.println("point = " + point);
        }
    }
}

class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        if(x < point.x) {
            return 1;
        }
        if(x > point.x) {
            return -1;
        }
        return point.y - y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}