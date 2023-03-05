import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] v;
    static boolean[] visited;
    static BufferedReader br;
    static BufferedWriter bw;

    public static void dfs(int x) throws IOException {
        visited[x] = true;
        bw.write(x+" ");
        for (int next : v[x]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void bfs(int start) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int x = q.poll();
            bw.write(x+" ");
            for (int next : v[x]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, m, start;
        String[] inputs = br.readLine().split(" ");
        n = Integer.parseInt(inputs[0]);
        m = Integer.parseInt(inputs[1]);
        start = Integer.parseInt(inputs[2]);

        v = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            v[i] = new ArrayList<Integer>();
        }

        for(int i=0;i<m;i++){
            int x,y;
            inputs=br.readLine().split(" ");
            x=Integer.parseInt(inputs[0]);
            y=Integer.parseInt(inputs[1]);
            v[x].add(y);
            v[y].add(x);
        }
        //Arrays.sort쓰면 왜 안되는가?
        for(int i=1;i<=n;i++) {
            Collections.sort(v[i]);
        }

        visited = new boolean[n + 1];
        dfs(start);
        bw.write("\n");
        visited =new boolean[n+1];
        bfs(start);
        bw.write("\n");

        br.close();
        bw.flush();
        bw.close();

    }


}


