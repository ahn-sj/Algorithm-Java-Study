package _4ÁÖÂ÷._11653¹ø;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		if(n == 1) System.exit(0);
		int b = 2;
		while(n != 1) {
			if(n%b == 0) {
				n = n/b;
				sb.append(b).append("\n");
			}
			else b++;
		}
		System.out.println(sb);
	}

}
