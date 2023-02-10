import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	static int N;
	static int[][] route;
	static boolean[] visited;
	static int answer = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		route = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				route[i][j] = Integer.parseInt(st.nextToken()); 
			}	
		}
		
		for (int i = 0; i < N; i++) {
			visited = new boolean[N];
			visited[i] = true; 
			dfs(i, i, 0, 0);
		}
		
		System.out.println(answer);
	}

	// start : 출발지점, now : 현재위치
	private static void dfs(int start, int now, int dep, int value) {
		
		if (dep == N-1) {
			if (route[now][start] != 0) {
				answer = Math.min(answer, value+route[now][start]);
			}
			return;
		}
		
		for (int i = 1; i < N; i++) {
			// route[now][i] 이동하려는 위치가 0이 아니면 = 이동할 수 있으면
			if (visited[i] == false && route[now][i] != 0) {
				visited[i] = true;
				dfs(start, i, dep+1, value+route[now][i]);
				visited[i] = false;
			}
		}
	}
}
