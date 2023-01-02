package 코테스터디.백준._10828번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
				case "push"    : stack.push(st.nextToken()); 
									  break;
				case "pop"     : if(!stack.isEmpty()) sb.append(stack.pop()).append("\n");
									  else sb.append(-1).append("\n");
									  break;
				case "size"     : sb.append(stack.size()).append("\n");
				                      break;
				case "empty" : if(!stack.isEmpty()) sb.append(0).append("\n");
									 else sb.append(1).append("\n");
									 break;
				case "top"   : if(!stack.isEmpty()) sb.append(stack.peek()).append("\n");
									  else sb.append(-1).append("\n"); 
									 break;	
			}		
		}
		System.out.println(sb);
	}

}
