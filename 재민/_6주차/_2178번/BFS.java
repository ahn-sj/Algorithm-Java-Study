package 스터디._6주차._2178번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS {
    static int N, M;
    static int[][] board, d;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N+1][M+1];
        d = new int[N+1][M+1];
        for(int i=1; i<=N; i++) {
            String str = br.readLine();
            for(int j=1; j<=M; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(str.charAt(j-1)));
            }
        }
        BFS(1, 1);
        System.out.println(d[N][M]);
    }

    private static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        d[x][y] = 1;
        while(!q.isEmpty()) {
            Point tmp = q.poll();
            for(int i=0; i<4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=1 && ny>=1 && nx<=N && ny<=M && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    d[nx][ny] += d[tmp.x][tmp.y] + 1;
                    q.offer(new Point(nx, ny));
                }
            }
        }

    }
}
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}