package study.jaeworkspace.baekjoon.w02;

import java.io.*;

/**
 * 1로 만들기
 */
public class NO1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int[] dp = new int[input + 1];
        dp[0] = dp[1] = 0;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        bw.write(dp[input] + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
