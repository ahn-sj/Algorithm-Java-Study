package 스터디._6주차._2667번_단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BFS {
    static int count = 0, N;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        String str;
        for(int i=0; i<N; i++) {
            str = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        solution();
        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    static void solution() {

        for(int i=0; i<N; i++) {
            for (int j = 0; j < N; j++) {
                if(board[i][j] == 1) {
                    count = 1;
                    board[i][j] = 0;
                    BFS(i, j);
                }
            }
        }
    }

    static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        while(!q.isEmpty()) {
            Point tmp = q.poll();
            for(int i=0; i<4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && ny>=0 && nx<N && ny <N && board[nx][ny] == 1) {
                    count++;
                    board[nx][ny] = 0;
                    q.offer(new Point(nx, ny));
                }
            }
        }
        list.add(count);
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
