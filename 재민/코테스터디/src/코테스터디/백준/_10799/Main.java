package 코테스터디.백준._10799;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

	public int solution(String str) {
		int answer = 0;
		char ck = ' ';
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(ck == '(' && x == ')') {
				ck = x;
				stack.pop();
				answer += stack.size();
			}else if(ck == ')' && x == ')'){
				ck = x;
				stack.pop();
				answer++;
			}else {
				stack.push(x);
				ck = x;
			}	
		}
		return answer;
	}

}
