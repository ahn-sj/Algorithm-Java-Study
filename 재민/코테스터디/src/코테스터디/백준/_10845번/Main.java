package 코테스터디.백준._10845번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<String> q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
				case "push"    : q.offer(st.nextToken()); 
									  break;
				case "pop"     : if(!q.isEmpty()) sb.append(q.pollFirst()).append("\n");
									  else sb.append(-1).append("\n");
									  break;
				case "size"     : sb.append(q.size()).append("\n");
				                      break;
				case "empty" : if(!q.isEmpty()) sb.append(0).append("\n");
									 else sb.append(1).append("\n");
									 break;
				case "front"   : if(!q.isEmpty()) sb.append(q.peekFirst()).append("\n");
									  else sb.append(-1).append("\n"); 
									 break;	
				case "back"   : if(!q.isEmpty()) sb.append(q.peekLast()).append("\n");
									 else sb.append(-1).append("\n"); 
									 break;	
			}		
		}
		System.out.println(sb);
	}

}
