package study.jaeworkspace.baekjoon.w03;

import java.io.*;
import java.util.Arrays;

/**
 * 계단 오르기
 */
public class NO2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int step = Integer.parseInt(br.readLine());
        int[] stairs = new int[step + 1];
        int[] scores = new int[step + 1];

        for (int i = 1; i <= step; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        stairs[1] = scores[1];
        stairs[2] = scores[2];

        for (int i = 3; i < scores.length; i++) {
            stairs[i] = Math.max(scores[i - 3] + scores[i - 1], scores[i - 2]) + scores[i];
        }
        System.out.println(Arrays.toString(stairs));
        System.out.println(Arrays.toString(scores));
        bw.write(stairs[step] + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
