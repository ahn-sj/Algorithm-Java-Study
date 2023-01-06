package _2ÀÏÂ÷._11656¹ø;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = new String[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.substring(i, str.length());
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		for(String x : arr) System.out.println(x);

	}

}
