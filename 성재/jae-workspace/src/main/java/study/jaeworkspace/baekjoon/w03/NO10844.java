package study.jaeworkspace.baekjoon.w03;

import java.io.*;

public class NO10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final long MOD = 1000000000;

        int len = Integer.parseInt(br.readLine());

        long[][] dy = new long[len + 1][10];

        // 1번째 자릿수
        for (int i = 1; i < 10; i++) {
            dy[1][i] = 1;
        }

        // 2번째 자릿수
        for (int i = 2; i <= len; i++) {
            for (int j = 0; j < 10; j++) { // i번째 자릿수의 값을 탐색
                if(j == 0) { // 자릿값이 0
                    dy[i][0] = dy[i - 1][1] % MOD;
                } else if(j == 9) { // 자릿값이 9
                    dy[i][9] = dy[i - 1][8] % MOD;
                } else { // 자릿값이 1~8 사이
                    dy[i][j] = (dy[i - 1][j - 1] + dy[i - 1][j + 1]) % MOD;
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
