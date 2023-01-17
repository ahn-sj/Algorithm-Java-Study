package study.jaeworkspace.baekjoon.w03;

import java.io.*;

/**
 * 1, 2, 3 더하기
 */
public class NO9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dy = new int[11];
        dy[1] = 1;
        dy[2] = 2;
        dy[3] = 4;

        for (int i = 4; i < dy.length; i++) {
            dy[i] = dy[i - 1] + dy[i - 2] + dy[i - 3];
        }

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            bw.write(dy[Integer.parseInt(br.readLine())] + "\n");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
