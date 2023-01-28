package 스터디._7주차._11725번_트리_부모찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DFS {
    static int N;
    static int[] answer;
    static boolean[] visit;
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visit = new boolean[N+1];
        answer = new int[N+1];
        for(int i=0; i<=N; i++) list.add(new ArrayList<>());

        for(int i=0; i< N-1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        DFS(1);
        for(int i=2; i<answer.length; i++) System.out.println(answer[i]);
    }
    static void DFS(int L) {
        visit[L] = true;
        for(int x : list.get(L)) {
            if(!visit[x]) {
                answer[x] = L;
                DFS(x);
            }
        }
    }
}
