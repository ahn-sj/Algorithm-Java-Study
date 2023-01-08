package _2ÀÏÂ÷._10824¹ø;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String num = "";
		long sum = 0;
		while(st.hasMoreElements()) {		
			for(int i=0; i<2; i++) {
				num += st.nextToken();
			}
			sum += Long.parseLong(num);
			num = ""; 
		}
		System.out.println(sum);
		br.close();
	}

}
