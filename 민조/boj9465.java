import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] d = new int[2][100001];
        int[][] a = new int[2][100001];
        int T=Integer.parseInt(br.readLine());
        while(T>0){
            int m = Integer.parseInt(br.readLine());
            for(int i=0;i<2;i++){
                String[] ts = br.readLine().split(" ");
                for(int j=0;j<m;j++){
                    a[i][j]=Integer.parseInt(ts[j]);
                    d[i][j]=a[i][j];
                }
            }
            d[0][1]+=d[1][0];
            d[1][1]+=d[0][0];
            for(int j=2;j<m;j++){
                d[0][j]=Math.max(d[1][j-1],d[1][j-2])+a[0][j];
                d[1][j]=Math.max(d[0][j-1],d[0][j-2])+a[1][j];
            }
            bw.write(Math.max(d[0][m-1],d[1][m-1])+"\n");
            T--;
        }

        br.close();
        bw.flush();
        bw.close();
    }
}