import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] v = new ArrayList[100001];
    static int[] p = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            v[i] = new ArrayList<>();
            p[i] = 0;
        }
        for (int i = 1; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            v[a].add(b);
            v[b].add(a);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        p[1]=1;
        while(!q.isEmpty()){
            int x=q.poll();
            for(int next : v[x]){
                if(p[next] == 0){
                    p[next]=x;
                    q.add(next);
                }
            }
        }
        for(int i=2;i<=n;i++){
            bw.write(p[i]+"\n");
        }



        br.close();
        bw.flush();
        bw.close();
    }


}


