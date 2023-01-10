package study.jaeworkspace.baekjoon.w03;

import java.io.*;

/**
 * 오르막 수
 */
public class NO11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final long MOD = 10007;

        int len = Integer.parseInt(br.readLine());

        long[][] dy = new long[len + 1][10];


        // 1번째 자릿수
        for (int i = 0; i < 10; i++) {
            dy[1][i] = 1;
        }

        // 2번째 자릿수
        for (int i = 2; i <= len; i++) {
            for (int j = 0; j < 10; j++) {
                if(j == 0) {
                    dy[i][j] = dy[i - 1][0];
                } else {
                    dy[i][j] = (dy[i][j - 1] + dy[i - 1][j]) % MOD;
                }
            }
        }
        long rst = 0;

        for (int i = 0; i < 10; i++) {
            rst += dy[len][i];
        }
        bw.write((rst % MOD) + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
