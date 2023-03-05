package study.jaeworkspace.baekjoon.w07;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 미로 탐색 (대각선 X)
 */
public class NO2178 {
    static boolean[][] checked;
    static int[][] miro;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        miro = new int[n][m];
        checked = new boolean[n][m];

//        for (int i = 0; i < n; i++) {
//            String[] location = br.readLine().split("");
//
//            for (int j = 0; j < m; j++) {
//                miro[i][j] = Integer.parseInt(location[j]);
//            }
//        }
        for (int i = 0; i < n; i++) {
             char[] location = br.readLine().toCharArray();

            for (int j = 0; j < m; j++) {
                miro[i][j] = Character.getNumericValue(location[j]);
            }
        }
        checked[0][0] = true;
        bfs(0,0);

        System.out.println(sb.append(miro[n-1][m-1]));
    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        checked[x][y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nowX = dx[i] + point.x;
                int nowY = dy[i] + point.y;

                if(nowX < 0 || nowY < 0 || nowX >= n || nowY >= m) continue;
                if(checked[nowX][nowY] || miro[nowX][nowY] == 0) continue;

                queue.offer(new Point(nowX, nowY));
                checked[nowX][nowY] = true;
                miro[nowX][nowY] = miro[point.x][point.y] + 1;
            }
        }
    }
}
