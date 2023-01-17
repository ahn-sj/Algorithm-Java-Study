package study.jaeworkspace.wanted;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] stones = new int[N];
        int[] counts = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < stones.length; i++) {
            stones[i] = Integer.parseInt(st.nextToken());
        }

        int stored = stones[0];
        for (int i = 1; i < stones.length; i++) {
            if(stored == stones[i]) { // i-1과 i의 값이 같은가
                counts[stored]++;
            }
            stored = stones[i];
        }
        System.out.println(Arrays.toString(counts));

        int rst = 0;

        if(N == 1) {
            rst = 1;
        } else if(counts[2] > 0) {
            rst = counts[1] - counts[2] + 1;
        } else {
            rst = counts[1] + 1;
        }

        bw.write((rst + ""));
        bw.flush();

        bw.close();
        br.close();
    }
}

