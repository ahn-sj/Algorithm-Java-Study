import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

import static java.util.Arrays.sort;

public class Main {
    static int[][] edge=new int[10][10];
    static int n,ans;
    static int[] order=new int[10];
    static Boolean[] check=new Boolean[10];
    static void dfs(int idx){
        if(idx>=n){
            int tans=0;
            for(int i=1;i<n;i++){
                if(edge[order[i-1]][order[i]] != 0){
                    tans += edge[order[i-1]][order[i]];
                }
                else {
                    tans=-1;
                    break;
                }
            }
            if(tans != -1) {
                if (edge[order[n - 1]][order[0]] == 0) tans = -1;
                else tans += edge[order[n - 1]][order[0]];
            }
            if(tans != -1)ans=Math.min(ans,tans);
            return;
        }
        for(int i=0;i<n;i++){
            if(check[i]==false){
                order[idx]=i;
                check[i]=true;
                dfs(idx+1);
                check[i]=false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n= Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            check[i] = false;
        }

        for(int i=0;i<n;i++){
            String[] inputs=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                edge[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        ans=100000000;
        dfs(0);

        bw.write(ans+"");
        br.close();
        bw.flush();
        bw.close();

    }


}
