package 스터디._6주차._11724번_연결_요소_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DFS_ArrayList {
    static int N, M;
    static ArrayList<ArrayList<Integer>> board;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new ArrayList<>();
        visit = new boolean[N+1];

        for(int i=0; i<=N; i++) {
            board.add(new ArrayList<>());   //먼저 List객체 생성
        }

        for(int i=1; i<=M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board.get(x).add(y);
            board.get(y).add(x);
        }
        int count = 0;
        for(int i=1; i<=N; i++) {
            if(!visit[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    static void DFS(int L) {
        if(visit[L]) return;

        visit[L] = true;

        for(int x : board.get(L)) {
            if(!visit[x]) {
                DFS(x);
            }
        }
    }
}
