package _3주차._11052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        int[] card = new int[n+1];	//카드 값 배열
	        int[] dp = new int[n+1];	
	        card[0] = 0;
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        //카드배열에 입력값 저장
	        for(int i = 1 ; i <= n ; i++) card[i] = Integer.parseInt(st.nextToken());
	        
	        for(int i=1; i<=n; i++) {
	        	for(int j=1; j<=i; j++) {
	        		dp[i] = Math.max(dp[i], card[j] + dp[i-j]);
	        		
	        	}
	        }
	        System.out.println(dp[n]); 
	}

}
