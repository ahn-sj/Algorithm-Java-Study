import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Edge>[] v = new ArrayList[100001];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        for (int i = 1; i <= n; i++) v[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            inputs = br.readLine().split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);
            int cost = Integer.parseInt(inputs[2]);
            v[x].add(new Edge(y, cost));
            v[y].add(new Edge(x, cost));
        }
        inputs=br.readLine().split(" ");
        int start=Integer.parseInt(inputs[0]);
        int end=Integer.parseInt(inputs[1]);


        boolean[] visited =new boolean[n+1];
        Queue<Integer> q=new LinkedList<>();
        int l = 1, r = 1000000000;
        while (l <= r) {
            int mid = (l + r) / 2;
            for(int i=1;i<=n;i++){
                visited[i]=false;
            }
            q.add(start);
            visited[start]=true;
            while(!q.isEmpty()){
                int x=q.poll();
                for(Edge next : v[x]){
                    if((next.cost >= mid) && (visited[next.y]==false)){
                        q.add(next.y);
                        visited[next.y]=true;
                    }
                }
            }
            if(visited[end])l=mid+1;
            else r=mid-1;
        }
        bw.write(r+"");

        bw.flush();
        br.close();
        bw.close();

    }


}

class Edge {
    int y, cost;

    Edge(int y, int cost) {
        this.y = y;
        this.cost = cost;
    }
}