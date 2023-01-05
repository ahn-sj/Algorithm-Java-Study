import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class MyQueue {
    private final LinkedList<Integer> myQueue;

    MyQueue(LinkedList<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    public void push(int val) {
        myQueue.offer(val);
    }

    public int top() {
        if (myQueue.isEmpty()) {
            return -1;
        }
        return myQueue.peek();
    }

    public int size() {
        return myQueue.size();
    }

    public int pop() {
        if (myQueue.isEmpty()) {
            return -1;
        }
        return myQueue.poll();
    }

    public int empty() {
        if (myQueue.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public int front() {
        if (myQueue.isEmpty()) {
            return -1;
        }
        return myQueue.peek();
    }

    public int back() {
        if (myQueue.isEmpty()) {
            return -1;
        }
        return myQueue.getLast();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        MyQueue myQueue = new MyQueue(new LinkedList<>());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push":
                    int val = Integer.parseInt(st.nextToken());
                    myQueue.push(val);
                    break;

                case "top":
                    System.out.println(myQueue.top());
                    break;

                case "size":
                    System.out.println(myQueue.size());
                    break;

                case "pop":
                    System.out.println(myQueue.pop());
                    break;

                case "empty":
                    System.out.println(myQueue.empty());
                    break;

                case "front":
                    System.out.println(myQueue.front());
                    break;

                case "back":
                    System.out.println(myQueue.back());
                    break;
            }
        }
    }
}
