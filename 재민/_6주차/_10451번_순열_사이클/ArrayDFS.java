package 스터디._6주차._10451번_순열_사이클;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayDFS {
    static int N,M, x;
    static int[][] board;
    static boolean[] visit;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            x = Integer.parseInt(br.readLine());
            board = new int[x+1][x+1];
            visit = new boolean[x+1];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<=x; j++) {
                int t = Integer.parseInt(st.nextToken());
                board[j][t] = board[t][j] = 1;
            }
            int count = 0;
            for(int k=1; k<=x; k++) {
                for(int f=1; f<=x; f++) {
                    if(!visit[f]) {
                        count++;
                        DFS(f);
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void DFS(int L) {
        visit[L] = true;
        for(int i=1; i<=x; i++) {
            if(board[L][i] == 1 && !visit[i]) {
                visit[i] = true;
                DFS(i);
            }
        }
    }
}