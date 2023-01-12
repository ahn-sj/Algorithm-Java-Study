package study.jaeworkspace.baekjoon.w04;

import java.io.*;
import java.util.Arrays;

/**
 * 버블 소트
 */
public class NO1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());

        boolean isFlag;
        int[] ints = new int[size + 1];

        for (int i = 1; i < ints.length; i++) {
            ints[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 1; i < ints.length; i++) {
            isFlag = false;
            for (int j = 1; j < ints.length - i; j++) {
                if(ints[j] > ints[j + 1]) {
                    isFlag = true;

                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
            if(!isFlag) {
                bw.write(i + "\n");
                break;
            }
        }
    }
}
