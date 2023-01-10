package _3����._9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[11];	//n�� 11���� �۱⶧��
		arr[0] = 0; // 0�� �� �� �ִ� ���� ����.
		arr[1] = 1;	// 1�� �� �� �ִ� ���� 1���� (1)
		arr[2] = 2;	// 2�� �� �� �ִ� ���� 2���� (1+1), (2)
		arr[3] = 4; // 3�� �� �� �ִ� ���� 4���� (1+1), (1+2), (2+1), (3)
		//arr[4] = �� �� ���� ���� ��
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			for(int j=4; j<=a; j++) {	// '<='����� ������ arr[0]�����߱� ����
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[a]);
		}
	}
	
}