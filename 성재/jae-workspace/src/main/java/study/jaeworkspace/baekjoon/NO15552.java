package study.jaeworkspace.baekjoon;

import java.io.*;

/**
 * 빠른 A+B
 */
public class NO15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";

        while ((str = br.readLine()) != null) {
            String[] testCases = str.split(" ");

            int sum = Integer.valueOf(testCases[0]) + Integer.valueOf(testCases[1]);
            bw.write(sum);
        }
        bw.flush();
    }
}
