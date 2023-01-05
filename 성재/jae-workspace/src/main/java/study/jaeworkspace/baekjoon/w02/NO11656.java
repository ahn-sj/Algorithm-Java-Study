package study.jaeworkspace.baekjoon.w02;

import java.io.*;
import java.util.Arrays;

/**
 * 접미사 배열
 */
public class NO11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String[] suffixes = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            suffixes[i] = word.substring(i);
        }
        Arrays.sort(suffixes);

        for (String suffix : suffixes) {
            bw.write(suffix + "\n");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}