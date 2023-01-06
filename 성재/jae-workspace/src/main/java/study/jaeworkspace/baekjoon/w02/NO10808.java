package study.jaeworkspace.baekjoon.w02;

import java.io.*;
import java.util.Arrays;

/**
 * 알파벳 개수
 */
public class NO10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabetCounts = new int[26];

        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            alphabetCounts[word.charAt(i) - 'a']++;
        }

        bw.write(
                Arrays
                        .toString(alphabetCounts)
                        .replaceAll(",", "")
                        .substring(1, Arrays.toString(alphabetCounts).length() - 26)
        );
        bw.flush();

        bw.close();
        br.close();
    }
}
