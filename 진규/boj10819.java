import java.io.*;
import java.util.StringTokenizer;


public class Main {

	static int N;
	static int[] num;
	static int[] selected_num;
	static boolean[] visited;
	static int answer = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		num = new int[N];
		visited = new boolean[N];
		selected_num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken()); 
		}
		
		permu(0);
		
		System.out.println(answer);
	}
	
	private static void permu(int cnt) {
		
		if (cnt == N) {
			answer = Math.max(get_value(), answer);
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				selected_num[cnt] = num[i];
				permu(cnt+1);
				visited[i] = false; 
			}
		}
		
	}

	private static int get_value() {
		
		int value = 0;
		
		for (int i = 0; i < N-1; i++) {		
			value += Math.abs(selected_num[i] - selected_num[i+1]);
		}
		
		return value;
	}
}
