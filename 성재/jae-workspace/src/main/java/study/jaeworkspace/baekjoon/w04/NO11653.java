package study.jaeworkspace.baekjoon.w04;

import java.io.*;

/**
 * 소인수분해
 */
public class NO11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int factor = 2;

        while (input != 1) {
            if(input % factor == 0) { // 인수분해가 되면
                bw.write(factor + "\n");
                input = input / factor;
            } else { // 인수분해가 안되면 2 -> 3 -> ...
                factor++;
            }
        } // 시간 제한 있을 시 for문으로 루트 n까지
        bw.flush();

        bw.close();
        br.close();
    }
}
