package 스터디._6주차._11724번_연결_요소_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFS_Arrays {
    static int N, M;
    static int[][] board;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N+1][N+1];
        visit = new boolean[N+1];
        for(int i=1; i<=M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = board[y][x] = 1;
        }

        int count = 0;

        for(int i=1; i<=N; i++) {
            if(!visit[i]) {
                DFS(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static void DFS(int L) {
        visit[L] = true;
        for(int i=1; i<=N; i++) {
            if(board[L][i] == 1 && !visit[i]) DFS(i);
        }
    }
}
