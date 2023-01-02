package 코테스터디.백준._9012번;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			String answer = "YES";
			Stack<Character> stack = new Stack<>();
			String str = sc.next();
			for(char x : str.toCharArray()) {
				if(x == ')') {
					if(stack.isEmpty()) {
						answer = "NO";
						break;
					}else stack.pop();
				}
				else stack.push(x);	
			}
			if(!stack.isEmpty()) answer = "NO";
			System.out.println(answer);
		}
	}

}
