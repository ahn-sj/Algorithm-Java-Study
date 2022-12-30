package study.jaeworkspace.baekjoon;

import java.io.*;

/**
 * 빠른 A+B
 */
public class NO15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < loopCount; i++) {
            String[] testCases = br.readLine().split(" ");

            bw.write(Integer.valueOf(testCases[0]) + Integer.valueOf(testCases[1]));
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
