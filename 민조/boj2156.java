import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a= new int[10001];
        int[] d =new int[10001];
        for(int i=1;i<=n;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        d[1]=a[1];
        d[2]=a[1]+a[2];
        for(int i=3;i<=n;i++){
            d[i] = d[i-1];
            d[i] = Math.max(d[i],d[i-2]+a[i]);
            d[i] = Math.max(d[i],d[i-3]+a[i-1]+a[i]);
        }
        bw.write(d[n]+"");
        br.close();
        bw.flush();
        bw.close();
    }
}