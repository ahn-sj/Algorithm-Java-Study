package 스터디._6주차._1707번_이분_그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS {
    static int K,V,E;
    static ArrayList<ArrayList<Integer>> graph;
    static int RED = 1, GREEN = -1;
    static int[] group;
    static String answer = "YES";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++) {
            answer = "YES";
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());
            graph = new ArrayList<>();
            for(int j=0; j<=V; j++) {
                graph.add(new ArrayList<>());
            }

            for(int k=1; k<=E; k++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph.get(x).add(y);
                graph.get(y).add(x);
            }
            group = new int[V+1];
            for(int k=1; k<=V; k++) {
                if(group[k] == 0) {
                    if(!BFS(k)) break;
                }
            }
            System.out.println(answer);
        }
    }

    static boolean BFS(int value) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(value);
        group[value] = RED;     //첫번째 값 레드로 지정

        while(!q.isEmpty()) {
            int node = q.poll();
            for(int x : graph.get(node)) {
                if(group[node] == group[x]) {   //이분 그래프가 아닐 경우
                    answer = "NO";
                    return false;
                }
                //헷갈리는 포인트는 차이점을 음수 RED 1과 양수 GREEN 1로 차이를 줘야한다.
                if(group[x] == 0) { //이분 그래프일경우
                    group[x] = group[node] * GREEN; //자신과 반대되는 색을 넣음
                    q.offer(x);
                }
            }
        }
        return true;
    }
}
