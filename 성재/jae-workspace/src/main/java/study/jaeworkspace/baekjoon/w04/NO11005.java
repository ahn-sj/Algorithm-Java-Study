package study.jaeworkspace.baekjoon.w04;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 진법 변환 2
 */
public class NO11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int decimal = Integer.parseInt(st.nextToken());
        int convert = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (decimal > 0) {
            int result = decimal % convert;
            if(result >= 10) { // 10진법이 넘어가는
                sb.append((char) ((result - 10) + 'A'));
            } else {           // 넘어가지 않는
                sb.append((char) (result + '0'));
            }
            decimal = decimal / convert;
        }
        sb.reverse();

        bw.write(sb + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
