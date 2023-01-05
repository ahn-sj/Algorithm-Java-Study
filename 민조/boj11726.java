import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] dp = new long[1001];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=1000;i++){
            dp[i]=dp[i-1]+dp[i-2];
            dp[i]%=10007;
        }
        int n = Integer.parseInt(br.readLine());
        bw.write(dp[n]+"");

        br.close();
        bw.flush();
        bw.close();
    }
}