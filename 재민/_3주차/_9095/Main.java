package _3주차._9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[11];	//n은 11보다 작기때문
		arr[0] = 0; // 0이 될 수 있는 경우는 없다.
		arr[1] = 1;	// 1이 될 수 있는 경우는 1가지 (1)
		arr[2] = 2;	// 2가 될 수 있는 경우는 2가지 (1+1), (2)
		arr[3] = 4; // 3이 될 수 있는 경우는 4가지 (1+1), (1+2), (2+1), (3)
		//arr[4] = 위 세 식을 더한 값
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			for(int j=4; j<=a; j++) {	// '<='사용한 이유는 arr[0]지정했기 때문
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[a]);
		}
	}
	
}