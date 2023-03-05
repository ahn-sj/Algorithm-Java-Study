package 스터디._7주차._11725번_트리_부모찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<=N; i++) {
            list.add(new ArrayList<Integer>());
        }
        for(int i=0; i<N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        boolean[] visit = new boolean[N+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);   //처음값 삽입
        visit[1] = true;    //방문체크
        int[] answer = new int[N+1];
        while(!q.isEmpty()) {
            Integer num = q.poll();
            for(Integer x : list.get(num)) {
                if(!visit[x]) {
                    visit[x] = true;
                    answer[x] = num;
                    q.add(x);
                }
            }
        }
        for(int i=2; i<answer.length; i++) System.out.println(answer[i]);
    }
}