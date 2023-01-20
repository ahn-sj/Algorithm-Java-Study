package 스터디._6주차._2178번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFS {  //DFS가 시간초과인 이유는 DFS는 가능한 경우의 수를 모두 포함하고 그에 비해 BFS는 빠른 경우를 우선시 탐색하기 때문이다.
    static int N,M;
    static int[][] board, dis;
    static boolean[][] visit;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N+1][M+1];
        dis = new int[N+1][M+1];
        visit = new boolean[N+1][M+1];
        for(int i=1; i<=N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(str.charAt(j - 1)));
            }
        }
        dis[1][1] = 1;
        DFS(1, 1);
        System.out.println(min);
    }
    static void DFS(int x, int y) {
        if(x == N && y == M) {
            min = Math.min(min, dis[N][M]);
            dis[x][y] = 0;
            return;
        }
        visit[x][y] = true;
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=1 && ny>=1 && nx<=N && ny<=M && board[nx][ny] == 1 && !visit[nx][ny]) {
                dis[nx][ny] += dis[x][y] + 1;
                DFS(nx, ny);
                visit[nx][ny] = false;
                dis[nx][ny] = 0;
            }
        }
    }
}


