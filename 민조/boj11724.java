import java.io.*;
import java.util.*;

public class Main {
    static Boolean[] c=new Boolean[1001];
    static ArrayList<Integer>[] v = new ArrayList[1001];

    public static void dfs(int x){
        c[x]=true;
        for(int next : v[x]){
            if(!c[next]){
                dfs(next);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);


        for(int i=1;i<=n;i++)v[i]=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)c[i]=false;


        for(int i=0;i<m;i++){
            inputs=br.readLine().split(" ");
            int x= Integer.parseInt(inputs[0]);
            int y =Integer.parseInt(inputs[1]);
            v[x].add(y);
            v[y].add(x);
        }

        int ans=0;
        for(int i=1;i<=n;i++){
            if(!c[i]){
                ans++;
                dfs(i);
            }
        }

        bw.write(ans+"");

        br.close();
        bw.flush();
        bw.close();
    }


}


