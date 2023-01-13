import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        long n = Long.parseLong(input[0]);
        long m = Long.parseLong(input[1]);

        long cnt2=cnt(n,2);
        long cnt5=cnt(n,5);

        cnt2 -= cnt(n-m,2);
        cnt5 -= cnt(n-m,5);

        cnt2 -= cnt(m,2);
        cnt5 -= cnt(m,5);

        bw.write(Math.min(cnt2,cnt5)+"");

        br.close();
        bw.flush();
        bw.close();
    }
    public static long cnt(long n,long cnt){
        long start=cnt,ret=0;
        while(start<=n){
            ret += n/start;
            start*=cnt;
        }
        return ret;
    }

}