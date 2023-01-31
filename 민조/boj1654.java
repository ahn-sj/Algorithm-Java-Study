import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {
    static long[] a = new long[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n, k;

        String[] inputs = br.readLine().split(" ");
        n = Long.parseLong(inputs[0]);
        k = Long.parseLong(inputs[1]);

        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(br.readLine());
        }

        long l = 1, r = Integer.MAX_VALUE;
        while (l <= r) {
            long mid = (l + r) / 2, cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt += a[i] / mid;
            }
            if (cnt >= k) l = mid + 1;
            else r = mid - 1;
        }
        bw.write(r+"");


        bw.flush();
        br.close();
        bw.close();

    }


}
