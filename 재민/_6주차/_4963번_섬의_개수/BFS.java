package 스터디._6주차._4963번_섬의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS {
    static int a, b;
    static int[][] board, d;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0) System.exit(0);
            board = new int[b][a];
            d = new int[b][a];
            for(int i=0; i<b; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int j=0; j<a; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            solution();
        }
    }

    static void solution() {
        int count = 0;
        for(int i=0; i<b; i++) {
            for(int j=0; j<a; j++) {
                if(board[i][j] == 1) {
                    board[i][j] = 0;
                    count++;
                    BFS(i, j);
                }
            }
        }
        System.out.println(count);
    }

    static void BFS(int x, int y) {
        q.offer(new Point(x, y));
        while(!q.isEmpty()) {
            Point tmp = q.poll();
            for(int i=0; i<8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && nx<b && ny>=0 && ny<a && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
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
