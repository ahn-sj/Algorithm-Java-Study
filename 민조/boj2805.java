import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {
    static long[] a = new long[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs= br.readLine().split(" ");
        long n = Long.parseLong(inputs[0]);
        long m = Long.parseLong(inputs[1]);
        inputs = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            a[i]=Long.parseLong(inputs[i]);
        }
        long l=0,r=Integer.MAX_VALUE;
        while(l<=r){
            long mid=(l+r)/2,cnt=0;
            for(int i=0;i<n;i++){
                if(a[i] > mid)cnt+=a[i]-mid;
            }
            if(cnt >= m)l=mid+1;
            else r=mid-1;
        }
        bw.write(r+"");
        bw.flush();
        br.close();
        bw.close();

    }


}
