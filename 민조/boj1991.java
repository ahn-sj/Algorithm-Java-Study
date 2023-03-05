import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] v=new ArrayList[20001];
    static int[] c= new int[20001];
    static Boolean flag;

    public static void dfs(int x,int color){
        c[x]=color;
        for(int next : v[x]){
            if(c[next]==0){
                dfs(next,3-color);
            }
            if(c[next] == color){
                flag=false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T=Integer.parseInt(br.readLine());
        while(T>0){
            int n,m;
            String[] inputs = br.readLine().split(" ");
            n=Integer.parseInt(inputs[0]);
            m=Integer.parseInt(inputs[1]);
            for(int i=1;i<=n;i++){
                v[i]=new ArrayList<Integer>();
                c[i]=0;
            }
            for(int i=0;i<m;i++){
                inputs=br.readLine().split(" ");
                int x=Integer.parseInt(inputs[0]);
                int y=Integer.parseInt(inputs[1]);
                v[x].add(y);
                v[y].add(x);
            }
            flag=true;
            for(int i=1;i<=n;i++){
                if(c[i]==0)dfs(i,1);
            }
            if(flag)bw.write("YES\n");
            else bw.write("NO\n");
            T--;
        }

        br.close();
        bw.flush();
        bw.close();


    }


}


