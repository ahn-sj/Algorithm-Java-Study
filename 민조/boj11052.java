import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] d = new int[1001];

        int n = Integer.parseInt(br.readLine());
        String[] ts = br.readLine().split(" ");
        int[] a=new int[1001];
        for(int i=1;i<=n;i++){
            a[i]= Integer.parseInt(ts[i-1]);
        }

        for(int i=1;i<=n;i++){
            d[i]=a[i];
            for(int j=1;j<i;j++){
                d[i]=Math.max(d[i],d[i-j]+a[j]);
            }
        }

        bw.write(d[n]+"");


        br.close();
        bw.flush();
        bw.close();
    }
}