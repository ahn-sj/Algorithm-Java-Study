import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Node>[] v = new ArrayList[100001];
    static int[] dist = new int[100001];
    static void dfs(int x,int p){
        for(Node next : v[x]){
            if(next.y == p)continue;
            dist[next.y]=dist[x]+next.cost;
            dfs(next.y,x);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            v[i] = new ArrayList<>();
            dist[i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            String[] inputs = br.readLine().split(" ");
            int x = Integer.parseInt(inputs[0]);
            for (int j = 1; j < inputs.length; j += 2) {
                int y = Integer.parseInt(inputs[j]);
                if (y == -1) break;
                int cost = Integer.parseInt(inputs[j + 1]);
                v[x].add(new Node(y, cost));
            }
        }
        dfs(1,1);
        int idx=0,MAX=-1;
        for(int i=1;i<=n;i++){
            if(MAX < dist[i]){
                MAX=dist[i];
                idx=i;
            }
            dist[i]=0;
        }
        dfs(idx,idx);
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=Math.max(ans,dist[i]);
        }
        bw.write(ans+"\n");




        br.close();
        bw.flush();
        bw.close();
    }


}


class Node {
    int y, cost;

    Node(int y, int cost) {
        this.y = y;
        this.cost = cost;
    }
}