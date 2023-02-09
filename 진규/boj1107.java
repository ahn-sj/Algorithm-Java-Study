import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		boolean[] broken = new boolean[10];
		if (M>0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				int idx = Integer.parseInt(st.nextToken());
				broken[idx] = true;
			}
		}

		int answer = Math.abs(N-100);
		
		for (int i = 0; i < 1000000+1; i++) {
			
			String str_i = i + "";

			boolean isbreak = false;
			for (int j = 0; j < str_i.length(); j++) {
				if (broken[str_i.charAt(j) - '0']) {
					isbreak = true;
					break;
				}
			}
			
			if (!isbreak) 
				answer = Math.min(answer, str_i.length()+Math.abs(i-N));
		}
		
		System.out.println(answer);
	}
}
