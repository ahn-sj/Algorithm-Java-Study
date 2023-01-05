import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class MyDeque {
    private ArrayDeque<Integer> myDeque;

    public MyDeque(ArrayDeque<Integer> deque) {
        this.myDeque = deque;
    }

    public void pushBack(int val) {
        myDeque.addLast(val);
    }

    public void pushFront(int val) {
        myDeque.addFirst(val);
    }

    public int popFront() {
        if (myDeque.isEmpty()) {
            return -1;
        }
        return myDeque.pollFirst();
    }

    public int popBack() {
        if (myDeque.isEmpty()) {
            return -1;
        }
        return myDeque.pollLast();
    }

    public int size() {
        return myDeque.size();
    }

    public int empty() {
        if (myDeque.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public int front() {
        if (myDeque.isEmpty()) {
            return -1;
        }
        return myDeque.peekFirst();
    }

    public int back() {
        if (myDeque.isEmpty()) {
            return -1;
        }
        return myDeque.peekLast();
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        MyDeque myDeque = new MyDeque(new ArrayDeque<Integer>());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            switch (s[0]) {
                case "push_front":
                    myDeque.pushFront(Integer.parseInt(s[1]));
                    break;
                case "push_back":
                    myDeque.pushBack(Integer.parseInt(s[1]));
                    break;
                case "pop_front":
                    System.out.println(myDeque.popFront());
                    break;
                case "pop_back":
                    System.out.println(myDeque.popBack());
                    break;
                case "size":
                    System.out.println(myDeque.size());
                    break;
                case "empty":
                    System.out.println(myDeque.empty());
                    break;
                case "front":
                    System.out.println(myDeque.front());
                    break;
                case "back":
                    System.out.println(myDeque.back());
                    break;
            }
        }
    }
}
public class b10866 {
    
}
