package study.jaeworkspace.baekjoon.prac;

import java.io.*;

/**
 * ints[1]이 1이 아니여야 하는 이유는 1로 만들기 때문에 1인 경우에 연산이 필요 없음
 */
public class NO1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] ints = new int[size + 1];

        for (int i = 2; i < ints.length; i++) {
            ints[i] = ints[i - 1] + 1;

            if(i % 2 == 0) {
                ints[i] = Math.min(ints[i], ints[i / 2] + 1);
            }
            if(i % 3 == 0) {
                ints[i] = Math.min(ints[i], ints[i / 3] + 1);
            }
        }
        bw.write(ints[size] + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
