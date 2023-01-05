import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int T = Integer.parseInt(br.readLine());
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) st1.add(s.charAt(i));

        while (T > 0) {
            String[] com = br.readLine().split(" ");
            switch (com[0].charAt(0)) {
                case 'L':
                    if(!st1.isEmpty())st2.add(st1.pop());
                    break;
                case 'D':
                    if(!st2.isEmpty())st1.add(st2.pop());
                    break;
                case 'B':
                    if(!st1.isEmpty())st1.pop();
                    break;
                case 'P':
                    st1.add(com[1].charAt(0));
                    break;
            }
            T--;
        }

        while (!st1.isEmpty()) st2.add(st1.pop());
        while (!st2.isEmpty()) bw.write(st2.pop() + "");

        br.close();
        bw.flush();
        bw.close();
    }
}