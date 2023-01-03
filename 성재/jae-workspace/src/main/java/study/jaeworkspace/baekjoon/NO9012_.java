package study.jaeworkspace.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 괄호
 */
public class NO9012_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < loopCount; i++) {
            String parenthesisString = br.readLine();

            for (int j = 0; j <= parenthesisString.length(); j++) {
                parenthesisString = parenthesisString.replace("()", "");
            }
            String result = parenthesisString.length() == 0 ? "YES" : "NO";
            System.out.println(result);
        }
        br.close();
    }
}
