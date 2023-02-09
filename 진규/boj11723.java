import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		HashSet<Integer> answer = new HashSet<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			if (command.equals("add")) {
				answer.add(Integer.parseInt(st.nextToken()));
			}
			else if (command.equals("remove")) {
				answer.remove(Integer.parseInt(st.nextToken()));
			}
			else if (command.equals("check")) {
				if (answer.contains(Integer.parseInt(st.nextToken()))) {
					sb.append(1 + "\n");
				}
				else {
					sb.append(0 + "\n");
				}
			}
			else if (command.equals("toggle")) {
				int num = Integer.parseInt(st.nextToken());
				if (answer.contains(num)) {
					answer.remove(num);
				}
				else {
					answer.add(num);
				}
			}
			else if (command.equals("all")) {
				for (int j = 1; j <= 20; j++) {
					answer.add(j);
				}
			}
			else if (command.equals("empty")) {
				answer.clear();
			}
		}
		
		System.out.println(sb);
	}
}
