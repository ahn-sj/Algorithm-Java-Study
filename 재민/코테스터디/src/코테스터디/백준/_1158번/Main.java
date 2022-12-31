package 코테스터디.백준._1158번;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] answer = new int[n];
		System.out.print("<");
		T.solution(n, m, answer);
		for(int i=0; i<n; i++) {
			if(i == n-1) System.out.print(answer[i]);
			else System.out.print(answer[i] + ", ");
		}
		System.out.println(">");
	}

	public int[] solution(int n, int m, int[] answer) {	
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=n; i++) q.offer(i);
		int count = 0;
		while(!q.isEmpty()) {
			for(int i=1; i<m; i++) q.offer(q.poll());
			answer[count++] = q.poll();			
			if(q.size() == 1) answer[count] = q.poll();
		}		
		return answer;
	}
}
