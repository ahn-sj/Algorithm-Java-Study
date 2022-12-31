package 코테스터디.백준.최소_최대;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		T.solution(n, arr);
	}

	public void solution(int n, int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int x : arr) {
			min = Math.min(min, x);
			max = Math.max(max, x);
		}
		System.out.println(min + " " + max);
	}

}
