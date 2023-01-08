import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        long[][] d=new long[101][10];
        for(int i=1;i<10;i++)d[1][i]=1;
        final long mod=1000000000;

        int n = Integer.parseInt(br.readLine());
        for(int i=2;i<=n;i++){
            for(int j=0;j<=9;j++){
                if(j>0)d[i][j]+=d[i-1][j-1];
                if(j<9)d[i][j]+=d[i-1][j+1];
                d[i][j]%=mod;
            }
        }
        long ans=0;
        for(int i=0;i<=9;i++){
            ans+=d[n][i];
            ans%=mod;
        }
        bw.write(ans+"");

        br.close();
        bw.flush();
        bw.close();
    }
}