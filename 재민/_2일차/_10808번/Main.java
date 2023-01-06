package _2ÀÏÂ÷._10808¹ø;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[26];
		String str = br.readLine();
		for(char x : str.toCharArray()) arr[x - 97]++;
		for(int x : arr) sb.append(x).append(" ");
		System.out.println(sb);
	}

}
