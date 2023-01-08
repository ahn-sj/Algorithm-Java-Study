package study.jaeworkspace.baekjoon.w03;

import java.io.*;

/**
 * 이친수
 */
public class NO2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        long[] pinaryNumbers = new long[91];

        pinaryNumbers[2] = pinaryNumbers[1] = 1;

        for (int i = 3; i <= number; i++) {
            pinaryNumbers[i] = pinaryNumbers[i - 1] + pinaryNumbers[i - 2];
        }
        bw.write(pinaryNumbers[number] + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
