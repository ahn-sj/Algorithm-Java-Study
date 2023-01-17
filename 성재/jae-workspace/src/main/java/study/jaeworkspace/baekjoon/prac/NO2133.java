package study.jaeworkspace.baekjoon.prac;

import java.io.*;

/**
 * 2133 타일 채우기
 */
public class NO2133 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] ints = new int[size + 1];

        ints[0] = 1;
        ints[1] = 3;

        for (int i = 2; i < ints.length; i++) {
            ints[i] = ints[i - 2] * 3;
        }
        bw.write(ints[size - 1] + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
