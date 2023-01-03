package study.jaeworkspace.baekjoon;

import java.io.*;
import java.util.Stack;

/**
 * 괄호 (스택 활용)
 */
public class NO9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> stack = new Stack<>();

        int loopCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < loopCount; i++) {
            String[] parenthesisStrings = br.readLine().split("");

            stack.clear();

            bw.write(validVPS(stack, parenthesisStrings) + "\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }

    private static String validVPS(Stack<String> stack, String[] parenthesisStrings) {
        for (int j = 0; j < parenthesisStrings.length; j++) {
            if(parenthesisStrings[j].equals("(")) {
                stack.add("(");
            } else if (stack.empty()) { // 스택이 비었으면
                return "NO"; // NO
            } else {
                stack.pop();
            }
        }
        return stack.empty() ? "YES" : "NO";
    }
}
