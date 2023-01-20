package 스터디._6주차._7576번_토마토;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS {
    static int N, M;
    static int day = Integer.MIN_VALUE;
    static int[][] board, d;
    static Queue<Point> q = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        d = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j <M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) q.offer(new Point(i, j));
            }
        }

        BFS();
        boolean check = true;
        for(int i=0; i<N; i++) {
            for (int j=0; j <M; j++) {
                if(board[i][j] == 0)  check = false;
            }
        }

        if(check) {
            for(int i=0; i<N; i++) {
                for (int j=0; j <M; j++) {
                    day = Math.max(day, d[i][j]);
                }
            }
            System.out.println(day);
        }
        else System.out.println(-1);

    }
    static void BFS(){
        while(!q.isEmpty()){
            Point tmp=q.poll();
            for(int i=0; i<4; i++){
                int nx=tmp.x+dx[i];
                int ny=tmp.y+dy[i];
                if(nx>=0 && nx<N && ny>=0 && ny<M && board[nx][ny]==0){
                    board[nx][ny]=1;
                    q.offer(new Point(nx, ny));
                    d[nx][ny]=d[tmp.x][tmp.y]+1;
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
