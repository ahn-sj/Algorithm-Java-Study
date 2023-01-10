package _3주차._9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        
        for(int t=0; t<n; t++) {
        	int a = Integer.parseInt(br.readLine());
        	
        	int[][] arr = new int[2][a+1];	//n+1은 0을 안쓰기위해서 
            int[][] dp = new int[2][a+1];
            
        	for(int i=0; i<2; i++) {	
        		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            	for(int j=1; j<=a; j++) {
            		arr[i][j] = Integer.parseInt(st.nextToken());
            	}	
            }
        	
        	dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];
            
            for(int i=2; i <= a; i++) {	//0은 일부로 비웠고 1은 채웠으니 2부터 시작
            	dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + arr[0][i];
            	dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + arr[1][i];
            }
            System.out.println(Arrays.deepToString(dp));
            System.out.println(Math.max(dp[0][a], dp[1][a]));
        }
    }
}
