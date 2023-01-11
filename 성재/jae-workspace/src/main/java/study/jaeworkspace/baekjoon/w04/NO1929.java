package study.jaeworkspace.baekjoon.w04;

import java.io.*;
import java.util.StringTokenizer;

public class NO1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        for (int i = start; i <= end; i++) {
            if(isPrime(i)) {
                bw.write(i + "\n");
            }
        }
        bw.flush();

        bw.close();
        br.close();
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if(i % j == 0) {
                return false;
            }

        }
        return true;
    }
}
