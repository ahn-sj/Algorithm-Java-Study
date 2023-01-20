package 스터디._6주차._1260번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, V;
    static int[][] board;
    static boolean[] visit;
    static Queue<Integer> q = new LinkedList<>();

    static void DFS(int L) {
        visit[L] = true;
        System.out.print(L + " ");
        for(int i=1; i<=N; i++) {
            if(board[L][i] == 1 && !visit[i]) DFS(i);
        }
    }

    static void BFS(int L) {
        q.offer(L);
        visit[L] = true;
        System.out.print(L + " ");
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(int i=1; i<=N; i++) {
                if(board[tmp][i] == 1 && !visit[i]) {
                    q.offer(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());   //정점의 개수
        M = Integer.parseInt(st.nextToken());   //간선의 개수
        V = Integer.parseInt(st.nextToken());   //정점의 번호
        board = new int[N+1][N+1];
        visit = new boolean[N+1];
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = board[y][x] = 1;
        }
        DFS(V);
        System.out.println();
        Arrays.fill(visit, false);
        BFS(V);
    }
}
