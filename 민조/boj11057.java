import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int mod = 10007;
        int[][] d = new int[1001][10];
        for(int i=0;i<10;i++)d[1][i]=1;


        int n = Integer.parseInt(br.readLine());
        for(int i=2;i<=n;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<=j;k++){
                    d[i][j] +=d[i-1][k];
                    d[i][j]%=mod;
                }
            }
        }
        int ans=0;
        for(int i=0;i<10;i++){
            ans+=d[n][i];
            ans%=mod;
        }
        bw.write(ans+"");



        br.close();
        bw.flush();
        bw.close();
    }
}