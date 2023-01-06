package _2����._1463��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int n = Integer.parseInt(br.readLine());
       int dp[] = new int[n+1];	//���� ���򰥸��� +1
       dp[0] = 0;
       dp[1] = 0;	//1�� �̹� 1�̱� ������ ������ �ʿ����
       for (int i = 2; i <= n; i++){
           dp[i] = dp[i-1];	// -1 �������� �� Ƚ�� ����
           if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2]);	//������ 2 �������� -1 ������ ��
           if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3]);
           dp[i] += 1; //���� Ƚ�� ����
       }
       bw.write(String.valueOf(dp[n]));
       br.close();
       bw.flush();
    }
}