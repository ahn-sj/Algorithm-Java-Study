import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class MyStack {
    private final Stack<Integer> myStack;

    public MyStack(Stack<Integer> myStack) {
        this.myStack = myStack;
    }

    public void push(int val) {
        myStack.push(val);
    }

    public int top() {
        if (myStack.isEmpty()) {
            return -1;
        }
        return myStack.peek();
    }

    public int size() {
        return myStack.size();
    }

    public int pop() {
        if (myStack.isEmpty()) {
            return -1;
        }
        return myStack.pop();
    }

    public int empty() {
        if (myStack.isEmpty()) {
            return 1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        MyStack myStack = new MyStack(new Stack<>());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    int val = Integer.parseInt(st.nextToken());
                    myStack.push(val);
                    break;

                case "top":
                    System.out.println(myStack.top());
                    break;

                case "size":
                    System.out.println(myStack.size());
                    break;

                case "pop":
                    System.out.println(myStack.pop());
                    break;

                case "empty":
                    System.out.println(myStack.empty());
                    break;
            }
        }
    }
}
