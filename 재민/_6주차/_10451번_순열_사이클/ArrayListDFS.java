package 스터디._6주차._10451번_순열_사이클;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayListDFS {
    static java.util.ArrayList<java.util.ArrayList<Integer>> graph;
    static int x;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            x = Integer.parseInt(br.readLine());
            graph = new java.util.ArrayList<>();
            visit = new boolean[x+1];
            for(int j=0; j<=x; j++) graph.add(new java.util.ArrayList<>());

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<=x; j++) {
                int a = Integer.parseInt(st.nextToken());
                graph.get(j).add(a);
            }
            int count = 0;
            for(int j=1; j<=x; j++) {
                if(DFS(j)) count++;
            }
            System.out.println(count);
        }
    }

    static boolean DFS(int L) {
        if(visit[L]) return false;  // (2,2)일경우 같은수가 매개변수로 오면 바로 종료 (사이클 불가)
        visit[L] = true;
        for(int x : graph.get(L)) {
            if(!visit[x]) DFS(x);
        }
        return true;
    }
}