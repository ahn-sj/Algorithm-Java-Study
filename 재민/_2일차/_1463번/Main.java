package _2일차._1463번;

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
       int dp[] = new int[n+1];	//숫자 안헷갈리게 +1
       dp[0] = 0;
       dp[1] = 0;	//1은 이미 1이기 때문에 연산이 필요없음
       for (int i = 2; i <= n; i++){
           dp[i] = dp[i-1];	// -1 연산했을 때 횟수 저장
           if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2]);	//나누기 2 했을때와 -1 했을때 비교
           if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3]);
           dp[i] += 1; //연산 횟수 증가
       }
       bw.write(String.valueOf(dp[n]));
       br.close();
       bw.flush();
    }
}