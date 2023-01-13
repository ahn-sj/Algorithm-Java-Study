package study.jaeworkspace.baekjoon.w04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Foo {
    public static void main(String[] args) {

        List<Point> points = Arrays.asList(
                new Point(3,5),
                new Point(1,2),
                new Point(2,6),
                new Point(5,3),
                new Point(2,2),
                new Point(6,7),
                new Point(5,2),
                new Point(3,2));

        // case: x를 내림차순 하되, x의 값이 중복되면 y의 값은 오름차순 정렬
        Comparator<Point> XComparator = new Comparator<Point>() {
            @Override
            public int compare(Point point1, Point point2) {
                return point1.x - point2.x;
            }
        };

        Comparator<Point> YComparator = new Comparator<Point>() {
            @Override
            public int compare(Point point1, Point point2) {
                return point2.y - point1.y;
            }
        };

        Collections.sort(points, XComparator);
        Collections.sort(points, YComparator);

        for (Point point : points) {
            System.out.println("point = " + point);
        }
    }
    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

}
