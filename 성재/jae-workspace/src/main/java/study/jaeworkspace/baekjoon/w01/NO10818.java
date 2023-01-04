package study.jaeworkspace.baekjoon.w01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 최소, 최대
 */
public class NO10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] given = new int[scan.nextInt()];

        for (int i = 0; i < given.length; i++) {
            given[i] = scan.nextInt();
        }
        Arrays.sort(given);

        System.out.println(given[0] + " " + given[given.length - 1]);
    }
}
