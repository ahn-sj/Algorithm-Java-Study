package study.jaeworkspace.baekjoon.w04;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 최대공약수와 최소공배수
 */
public class NO2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int left = Integer.parseInt(st.nextToken());
        int right = Integer.parseInt(st.nextToken());

        int gcd = gcd(left, right);
        bw.write(gcd + "\n" + ((left * right) / gcd));
        bw.flush();

        br.close();
        bw.close();
    }

    private static int gcd(int left, int right) {
        if(left % right == 0) {
            return right;
        }

        return gcd(right, left % right);
    }
}
