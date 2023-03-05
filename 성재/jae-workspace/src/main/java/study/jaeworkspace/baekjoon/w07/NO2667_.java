package study.jaeworkspace.baekjoon.w07;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Queue;
import java.util.*;

public class NO2667_ {

    static int[] dx = {0, 1, 0, -1}; // 동남서북
    static int[] dy = {1, 0, -1, 0};

    static int[][] homes;
    static boolean[][] checked;

    static int counter;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());

        List<Integer> apartment = new ArrayList<>();
        
        homes = new int[total][total];
        checked = new boolean[total][total];

        for (int i = 0; i < total; i++) {
            String[] apartments = br.readLine().split("");

            for (int j = 0; j < apartments.length; j++) {
                homes[i][j] = Integer.parseInt(apartments[j]);
            }
        }

        for (int i = 0; i < homes[0].length; i++) { // 정사각형
            for (int j = 0; j < homes[0].length; j++) {
                if(!checked[i][j] && homes[i][j] == 1) { // checked[i][j] 가 false인 경우
                    counter = 1;
                    bfs(i, j);
                    apartment.add(counter);
                }
            }
        }
        Collections.sort(apartment);

        sb.append(apartment.size());
        for (Integer integer : apartment) {
            sb.append("\n" + integer);
        }
        System.out.println(sb.toString());

    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        checked[x][y] = true;
        
        while (!queue.isEmpty()) { // queue is not empty
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) { // 4 = direction count
                int curX = dx[i] + point.x;
                int curY = dy[i] + point.y;

                if(curX >= 0 && curY >= 0 && curX < homes[0].length && curY < homes[0].length
                        && !checked[curX][curY] && homes[curX][curY] == 1) {
                    queue.offer(new Point(curX, curY));
                    checked[curX][curY] = true;
                    counter++;
                }
            }
        }
    }
}
