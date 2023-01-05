import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Stack<Integer> myStack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char[] charArray = sc.next().toCharArray();
            validateP(charArray);
        }
        sc.close();
    }

    private static void validateP(char[] charArray) {
        myStack.clear();
        for (char x : charArray) {
            if (x == '(') {
                myStack.push(1);
            } else {
                if (myStack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                myStack.pop();
            }
        }
        if (myStack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
