package _4����._2609��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int x = 0;
		for(int i=1; i<=a; i++) if(a%i==0 && b%i==0) x = i;	//��� �������� 0�϶� �ִ�����
		System.out.println(x + "\n" + (a*b) / x);	
	}

}
