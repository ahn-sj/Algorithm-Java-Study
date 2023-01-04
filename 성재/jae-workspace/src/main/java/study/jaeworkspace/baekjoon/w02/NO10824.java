package study.jaeworkspace.baekjoon.w02;

import java.io.*;

/**
 * 네 수
 */
public class NO10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] naturalNumbers = br.readLine().split(" ");

        bw.write((Long.valueOf(naturalNumbers[0] + naturalNumbers[1]) +
                Long.valueOf(naturalNumbers[2] + naturalNumbers[3])) + "\n");

        bw.close();
        br.close();
    }
}
