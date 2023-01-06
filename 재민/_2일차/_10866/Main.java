package _2ÀÏÂ÷._10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreElements()) {
				switch(st.nextToken()) {
					case "push_front" :	q.offerFirst(Integer.parseInt(st.nextToken()));
										break;
					case "push_back"  :	q.offerLast(Integer.parseInt(st.nextToken()));
										break;	
					case "pop_front"  :	if(!q.isEmpty()) sb.append(q.pollFirst()).append("\n");
										else sb.append(-1).append("\n");	
										break;		
					case "pop_back"   :	if(!q.isEmpty()) sb.append(q.pollLast()).append("\n");
										else sb.append(-1).append("\n");
										break;		
					case "size" 	  : sb.append(q.size()).append("\n");	
										break;		
					case "empty" 	  : if(q.isEmpty()) sb.append(1).append("\n");
										else sb.append(0).append("\n"); 
										break;	
					case "front" 	  : if(!q.isEmpty()) sb.append(q.peekFirst()).append("\n");
										else sb.append(-1).append("\n"); 
										break;	
					case "back" 	  : if(!q.isEmpty()) sb.append(q.peekLast()).append("\n");
										else sb.append(-1).append("\n"); 
										break;	
				}
			}
		}
		System.out.println(sb);
	}
}
